import java.math.*;

class Solution {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length - 1;
        BigInteger num = new BigInteger("0");
        

        for(int i = 0; i <= len; i++) {
            num = num.add(BigInteger.valueOf((digits[i])));
            if(digits.length != 0) {
                if(i < len) {
                    num = num.multiply(BigInteger.valueOf(10));
                }
            }
        }
        
        num = num.add(BigInteger.valueOf(1));

        String s = String.valueOf(num);

        int[] newDigits = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            newDigits[i] = Character.getNumericValue(c);
        }
        
        return newDigits;
    }
}