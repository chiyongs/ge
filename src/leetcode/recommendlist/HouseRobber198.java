package leetcode.recommendlist;

public class HouseRobber198 {
    public int rob(int[] nums) {
        return rob(nums, nums.length - 1);
    }

    int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        return Math.max(rob(nums, i-2) + nums[i], rob(nums, i-1));
    }
}
