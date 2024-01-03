import java.util.Arrays;

class lc1 {
    public static void main(String[] args) {
        int[] greed = { 1, 2 };
        int[] cookies = { 3, 4, 5 };
        System.out.println(findContentChildren(greed, cookies));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        short i = 0, j = 0, count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return (int) count;
    }
}