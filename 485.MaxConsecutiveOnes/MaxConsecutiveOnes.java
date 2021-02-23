class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int count = 0;
        a.add(0);
        
        if(nums.length == 0) {
            if(nums[0] == 1) {
                count++;
                a.add(count);
            }
            else {
                return count;
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(i < nums.length - 1) {
                if(nums[i] == 0) {
                    count = 0;
                }
                else if((nums[i] == 1) && (nums[i + 1] != 0)) {
                    count++;
                }
                else {
                    count++;
                    a.add(count);
                }
            }
            else if(nums[nums.length - 1] == 1) {
                count++;
                a.add(count);
            }
            else {
                count = 0;
            }
        }
        
        Collections.sort(a);
        
        return a.get(a.size() - 1);
    }
}
