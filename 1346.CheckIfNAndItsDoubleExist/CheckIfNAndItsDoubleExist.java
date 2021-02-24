class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean flag = false;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if((arr[i] == 0) && (arr[j] == 0) && (i != j)) {
                    flag = true;
                }
                else if((arr[i] == 2 * arr[j]) && (i != j)) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}