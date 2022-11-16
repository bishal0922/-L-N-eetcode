class Solution {
    public int lengthOfLastWord(String s) {
        //easy 5 minute solution
        //we only need to account for the length of the last word while ignoring the spaces surrounding it (if theres any)

        //creating a pointer that will track the length of our return last word
        int ptr = 0;

        //iterating through the string from the back
        for (int i = s.length() - 1; i >= 0; i--){
            //if the character is a space we ignore it 
            if (s.charAt(i) == ' '){
                //if the character is a space and we have already found some letters after it then it must be initial space before start of the word then we return ptr
               if (ptr > 0) return ptr;
            } else{
                //if it isn't a space character then we increment the word len count
                ptr++;
            }
        }

        //return the count regardless
        return ptr;
    }
}
