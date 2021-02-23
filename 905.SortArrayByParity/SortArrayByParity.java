class Solution {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
            
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                nums.add(0, A[i]);
            }
            else {
                if(nums.size() > 0) {
                    nums.add(nums.size(), A[i]);
                }
                else {
                    nums.add(0, A[i]);
                }
            }
        }
        
        int[] output = nums.stream().mapToInt(i -> i).toArray();
        
        return output;
    }
}