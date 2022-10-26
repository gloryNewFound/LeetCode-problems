public class Solution704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target) {
        int lowest = 0;
        int highest = nums.length - 1;
        int middle;
        while (lowest <= highest) {
            middle = (lowest + highest) / 2;
            System.out.println(middle);
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                highest = middle - 1;
            } else {
                lowest = middle + 1;
            }
        }

        return -1;
    }
}
