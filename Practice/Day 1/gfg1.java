class gfg1 {

    public static void main(String[] args) {
        int[] nums = { 6, 14, 12, 14 };
        int k = 2;
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
            if (freq[(k - num)%k] != 0) {
                freq[(k - num)%k]--;
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