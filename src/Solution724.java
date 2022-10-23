public class Solution724 {

    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println((new Solution724()).pivotIndex(nums));

    }

    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < nums.length; i++) {
            sumRight += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            sumRight -= nums[i];
            if (sumLeft == sumRight) {
                return i;
            } else {
                sumLeft += nums[i];

            }
        }

        return -1;
    }
}
