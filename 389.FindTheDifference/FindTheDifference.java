class Solution {
    public char findTheDifference(String s, String t) {
        char sCharArray[] = s.toCharArray();
        char tCharArray[] = t.toCharArray();
        
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        
        char c = ' ';
        
        for(int i = 0; i < tCharArray.length; i++) {
            if(i != sCharArray.length) {
                if(sCharArray[i] != tCharArray[i]) {
                    c = tCharArray[i];
                    return c;
                }
            }
            else {
                c = tCharArray[tCharArray.length - 1];
            }
        }
        return c;
    }
}