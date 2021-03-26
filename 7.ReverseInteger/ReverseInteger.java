class Solution {
    public int reverse(int x) {
        String reverse = "";
        int z;
        
        if(x == 0) {
            z = 0;
        }
        else if(x < 0) {
            x = Math.abs(x);
            while(x > 0) {
                reverse += x % 10;
                x = x / 10;   
            }
            try {
                z = Integer.parseInt(reverse);
                z = z * -1;
            }
            catch (NumberFormatException e) {
                return 0;
            }
        }
        else {
            while(x > 0) {
                reverse += x % 10;
                x = x / 10;  
            }
            try {
                z = Integer.parseInt(reverse);
            }
            catch (NumberFormatException e) {
                return 0;
            }
        }
        return z;
    }
}