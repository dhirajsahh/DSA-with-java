
public class basic {

    public static int maximumSubsum(int[] nums, int k) {
        int wSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            wSum += nums[i];
        }
        maxSum = Math.max(maxSum, wSum);
        for (int i = k; i < nums.length; i++) {
            wSum = wSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, wSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 9, 31, -4, 21, 7 };
        int k = 3;
        int sum = maximumSubsum(arr, k);
        System.out.println(sum);
    }
}
