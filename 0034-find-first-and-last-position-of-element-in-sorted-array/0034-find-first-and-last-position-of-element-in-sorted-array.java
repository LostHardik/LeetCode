class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);

        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }

    private int lowerBound(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int answer = nums.length;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    private int upperBound(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int answer = nums.length;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}