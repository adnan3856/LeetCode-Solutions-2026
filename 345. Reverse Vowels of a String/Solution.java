// My Solution
class Solution {
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        char[] str = s.toCharArray();
        while(i < j){
            if("aeiouAEIOU".indexOf(s.charAt(i)) == -1 )  // this takes extra time indexOf
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


// Another solution - faster than above approach
class Solution {
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        char[] str = s.toCharArray();
        while(i < j){
            if( !isVowel(s.charAt(i)))
                i++;
            if( !isVowel(s.charAt(j)))
                j--;
            if(isVowel(s.charAt(i))== true && isVowel(s.charAt(j))== true ){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }      
        }
        return new String(str);
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
