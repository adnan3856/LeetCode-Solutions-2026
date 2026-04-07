class Solution {
    public int firstUniqChar(String s) {
        int[ ] alphabets = new int[28];
        for(int i=0; i< s.length(); i++) {
                alphabets[s.charAt(i)-97]++; 
                // System.out.println(alphabets[s.charAt(i)-97]);
            }
        
        for(int i=0; i< s.length(); i++) {
                if(alphabets[s.charAt(i) - 97] == 1)
                    return i; 
            }
        return -1;
    }
}
