public class Solution409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {

        int[] count = new int[128];
        for (char symbol: s.toCharArray()) {
            count[symbol]++;
        }

        int result = 0;
        for (int v: count) {
            result += v / 2 * 2;
            if ( (result % 2 == 0) && (v % 2 == 1) ) {
                result++;
            }
        }

        return result;
    }
}
