class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) {
            return 0;
        }
        else if(s.trim().isEmpty()) {
            return 0;
        }
        else{
            s = s.trim();
        }
        
        int len = s.length() - 1;
        
        if(s.length() > 0) {
            for(int i = len; i >= 0; i--) {
                if(s.charAt(i) == ' ') {
                    return len - i;
                }
            }
            for(int i = len; i >= 0; i--) {
                return s.length();
            }
        }
        return 0;
    }
}