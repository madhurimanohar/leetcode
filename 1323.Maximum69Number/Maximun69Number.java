class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder(s);
        
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break;
            }
        }
        
        int output = Integer.parseInt(sb.toString());
        
        return output;
    }
}