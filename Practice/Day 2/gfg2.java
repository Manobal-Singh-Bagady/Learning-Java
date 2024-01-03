class gfg2 {

    public static long maxSumWithK(long a[], long n, long k) {
        long ans = 0;
        long currSum = 0;
        long prevElemSum = 0;

        for (int i = 0; i < k; i++) {
            currSum += a[i];
        }
        ans = currSum;
        int prevIndex = 0;
        for (int i = (int) k; i < n; i++) {
            currSum += a[i];
            ans = Math.max(currSum, ans);
            prevElemSum += a[prevIndex++];

            if (prevElemSum < 0) {
                currSum -= prevElemSum;
                prevElemSum = 0;
                ans = Math.max(currSum, ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] arr = { 1, -2, 2, -3 };
        long k = 2;
        long ans = maxSumWithK(arr, arr.length, k);
        System.out.println(ans);
    }

}