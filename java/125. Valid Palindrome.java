//Neetcode -> Two Pointers

class Solution {
    public boolean isPalindrome(String s) {
        //one solution would be using functions such as replaceAll to remove all non-alphanumeric characters and toLowerCase() the string
        //then using a StringBuffer and checking the reverse value of both strings
        //another approach is two pointer method:
        
        //declaring pointers;
        int l = 0;
        int r = s.length() - 1;
        
        while (l <= r){
            //checking if a given character is alphanumeric or not
            //if not we skip it -- we move the pointer and the while loop executes again
            if (!Character.isLetterOrDigit(s.charAt(l))){
                l++; 
            }else if (!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            } else {
                //only when we see a match is when we update both pointers
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
                }
            l++;
            r--;
            }
            
        }
        //we don't encounter false and our while looop doesn't run
        return true;
    }
}
