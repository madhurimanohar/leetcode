class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = false;
        int rev = 0;
        int temp = x;
        if(x < 0) {
            flag = false;
        }
        else if ((x < 10)) {
            flag = true;
        }
        else {
            while(x != 0) {
                int pal = x % 10; // get the remainder
                rev = rev * 10 + pal;
                x = x / 10;
                if(rev == temp) {
                    flag = true;
                }
                else {
                    flag = false;
                }
            }
        }
        return flag;
    }
}