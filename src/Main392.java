public class Main392 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "ahbgdcd";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int counter = 0;
        int searcher = 0;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = counter; j < t.length(); j++) {
                if (sArray[i] == tArray[j]) {
                    counter = j + 1;
                    searcher++;
                    break;
                }
            }
        }
        return searcher == s.length() ? true : false;
    }
}
