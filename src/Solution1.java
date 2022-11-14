import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i: result) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (mapa.containsKey(target - nums[i])) {
                result[0] = mapa.get(target - nums[i]);
                result[1] = i;
            } else {
                mapa.put(nums[i], i);
            }
        }
        return result;
    }
}
