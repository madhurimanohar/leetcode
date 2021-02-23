class Solution {
    public int addDigits(int num) {
        int mod = 0;
        int div = 0;
        int count = num;
        while(count > 0) {
            mod = num % 10;
            div = num / 10;
            num = mod + div;
            count = num;
            count = count / 10;
        }
        return num;
    }
}