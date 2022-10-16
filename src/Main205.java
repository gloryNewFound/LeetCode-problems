import java.util.HashMap;
import java.util.Map;

public class Main205 {

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put(s.charAt(0), t.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (dictionary.containsKey(s.charAt(i))) {
                if (t.charAt(i) != dictionary.get(s.charAt(i))) {
                    return false;
                }
            } else {
                if (!dictionary.containsValue(t.charAt(i))) {
                    dictionary.put(s.charAt(i), t.charAt(i));
                } else {
                    return false;
                }
            }
        }
    return true;
    }
}
