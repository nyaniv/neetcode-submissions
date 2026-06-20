class Solution {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        while(min <= max) {
            int curr = (max + min) / 2;
            if(nums[curr] == target) {
                return curr;
            }
            else if(target > nums[curr]) {
                min = curr + 1;
            }
            else {
                max = curr - 1;
            }
        }
        return -1;
    }
}
