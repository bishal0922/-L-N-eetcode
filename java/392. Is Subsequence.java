class Solution {
    public boolean isSubsequence(String s, String t) {
        //simple 5 min solution I came up with it involves two pointer

        //the "s" string is empty then its automatically a subsequence hence we return true
        if (s.length() == 0) return true;

        //creating two different pointers
        //l to be our main pointer for us to iterate through the "t" string 
        //ptr to be our slower/follower pointer to move through the "s" string
        int l = 0;
        int ptr = 0;

        //while we don't reach the end of the "t" string
        while (l < t.length()){
            //if we see a match then we move our slower pointer
            if (s.charAt(ptr) == t.charAt(l)){
                ptr++;
                //if we have moved the pointer the same times as the length of the "t" string then we have a subsequence
                if (ptr == s.length()) return true;
           } 
           //move the main pointer regardless
           l++;
        }

        //return false or check if ptr and length of "s" which is obvious as we didn't return in the loop
        return ptr == s.length();
    }
}
