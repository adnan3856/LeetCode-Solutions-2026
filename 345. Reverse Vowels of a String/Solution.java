// My Solution
class Solution {
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        char[] str = s.toCharArray();
        while(i < j){
            if("aeiouAEIOU".indexOf(s.charAt(i)) == -1 )
                i++;
            if("aeiouAEIOU".indexOf(s.charAt(j)) == -1 )
                j--;
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1 && "aeiouAEIOU".indexOf(s.charAt(j)) != -1 ){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }      
        }
        return new String(str);
    }
}
