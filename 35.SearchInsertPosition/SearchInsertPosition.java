class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        
        for(int i = 0; i <= nums.length - 1; i++) {
            if(nums[i] == target) {
                index = i;
                break;
            }
            else if(nums[i] > target) {
                index = i;
                break;
            }
            else if(nums[nums.length - 1] < target) {
                System.out.println("val of i : " + i);
                index = nums.length;
                break;
            }
        }
        return index;
    }
}