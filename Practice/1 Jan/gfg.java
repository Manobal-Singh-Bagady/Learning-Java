class Solution {

    public static void main(String[] args) {
        int[] nums = { 9, 7, 5, 3 };
        int k = 6;
        System.out.println(canPair(nums, k));
    }

    public static boolean canPair(int[] nums, int k) {
        if (nums.length % 2 != 0)
            return false;

        int[] freq = new int[k];

        /*
         * (i+j)%k=0
         * i%k + j%k = k
         * j%k = k-i%k
         */
        for (int i : nums) {
            int num = i % k;
            if (freq[k - num] != 0) {
                freq[k - num]--;
            } else {
                freq[num]++;
            }
        }
        for (int i : freq) {
            if (i != 0)
                return false;
        }
        return true;

    }
}