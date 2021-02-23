class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int[] arr = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            arr[i] = Character.digit(s.charAt(i), 2);
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        
        for (int i : arr) {
            sb.append(i);
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}