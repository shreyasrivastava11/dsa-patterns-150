class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while(i < j){

            if(!Character.isLetterOrDigit(s.charAt(i))){
                i+=1;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j-=1;
            }else if(s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i+=1;
                j-=1;
            }
        }

        return true;
    }
}
