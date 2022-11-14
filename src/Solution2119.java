public class Solution2119 {

    public static void main(String[] args) {
        int num = 526;
        System.out.println(isSameAfterReversals(num));
    }

    public static boolean isSameAfterReversals(int num) {
        int reversed1 = reverseNum(num);
        int reversed2 = reverseNum(reversed1);
        return num == reversed2;
    }
    public static int reverseNum(int num) {
        int reversed = num % 10;
        num = num / 10;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return reversed;
    }
}
