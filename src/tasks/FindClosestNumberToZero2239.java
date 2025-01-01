package tasks;

import static java.lang.Math.abs;

public class FindClosestNumberToZero2239 {
    public static void main(String[] args) {
        int[] nums = {-4, -2, 1, 4, 8};
        System.out.println(findClosestNumber(nums));
    }

    public static int findClosestNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int closest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (abs(nums[i]) < abs(closest)) {
                closest = nums[i];
            } else if (abs(nums[i]) == abs(closest) && nums[i] > closest) {
                closest = nums[i];
            }
        }
        return closest;
    }
}
