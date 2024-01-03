import java.util.ArrayList;
import java.util.List;

class lc2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = { 1, 3, 4, 1, 2, 3, 1 };
        List<List<Integer>> ans = obj.findMatrix(arr);
        System.out.println(ans.toString());
    }
}

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int[] freq = new int[nums.length + 1];

        for (int num : nums) {
            // if the frequency of current
            // element is greater than or equal
            // to current number or arrays in ans
            // array, add a new array in answer.
            if (freq[num] >= ans.size()) {
                ans.add(new ArrayList<>());
            }

            // add the current element to the appropriate array in ans.
            ans.get(freq[num]).add(num);

            // inclrease the frequency of num.
            freq[num]++;

        }
        return ans;
    }
}