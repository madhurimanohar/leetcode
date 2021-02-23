class Solution {
    public boolean isAnagram(String s, String t) {
        char sCharArray[] = s.toCharArray();
        char tCharArray[] = t.toCharArray();
        
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        
        if(Arrays.equals(sCharArray, tCharArray) == true) {
            return true;
        }
        else {
            return false;
        }
    }
}