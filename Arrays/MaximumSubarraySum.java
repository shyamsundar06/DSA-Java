
public class MaximumSubarraySum {
    public static int maxSum(int[] nums, int k) {
        if (nums == null || k <= 0 || k > nums.length) {
            return -1;
        }

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSum(nums, k));
    }
}
