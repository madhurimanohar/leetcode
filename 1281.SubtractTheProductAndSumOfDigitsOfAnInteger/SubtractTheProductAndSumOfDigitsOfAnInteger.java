class Solution {
    public int subtractProductAndSum(int n) {
        int numP = 1;
        int numS = 0;
        
        while(n > 0) {
            numP = numP * (n % 10);
            numS = numS + (n % 10);
            n = n / 10;
        }
        
        return numP - numS;
    }
}