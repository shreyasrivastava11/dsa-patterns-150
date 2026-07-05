class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        int k = 0;

        for(int i = 0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }

        int j = str.length() - 1;

        while(k < j){
            if(str.charAt(k) != str.charAt(j)){
                return false;
            }
            k+=1;
            j-=1;
        }
        return true;
    }
}
