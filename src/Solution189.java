public class Solution189 {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 3;
        rotate(nums, k);
        for (int i: nums) {
            System.out.print(i + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        if (nums.length != 1) {
            if (k < nums.length) {k = nums.length;}
            for (int i = 0; i < (nums.length - k) / 2; i++) {
                int temp = nums[nums.length - k - i - 1];
                nums[nums.length - k - i - 1] = nums[i];
                nums[i] = temp;
            }
            for (int i = 1; i <= k / 2; i++) {
                int temp = nums[nums.length - i];
                nums[nums.length - i] = nums[nums.length - k - 1 + i];
                nums[nums.length - k - 1 + i] = temp;
            }
            for (int i = 0; i < (nums.length) / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = temp;
            }
        }
    }
}


//Step 1 - 12345 6789 ---> 54321 6789
//
//        Step 2 - 54321 6789 ---> 54321 9876

//        Step 3 - 543219876 ---> 678912345