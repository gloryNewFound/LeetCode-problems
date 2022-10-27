import java.util.ArrayList;
import java.util.List;

public class Solution509 {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int n) {
        int current = 0;
        int next = 1;
        int memory;
        for (int i = 1; i <= n; i++) {
            memory = current + next;
            current = next;
            next = memory;
        }
        return current;
    }

}
