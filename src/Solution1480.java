public class Solution1480 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] sum = (new Solution1480()).runningSum(nums);
        for (int i: sum) {
            System.out.println(i);
        }
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}