class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        boolean flag = false;
        
        for(int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                if(arr[i] % 2 != 0) {
                    count++;
                    if((arr[i + 1] % 2 == 0) && (count <= 2)) {
                        count = 0;
                    }
                    else if(count == 3) {
                        flag = true;
                        break;
                    }
                }
            }
            else if(i == arr.length - 1) {
                if((count == 2) && (arr[arr.length - 1] % 2 != 0)) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}