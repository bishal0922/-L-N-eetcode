//Neetcode -> Array & Hashing

class Solution {
    public boolean isAnagram(String s, String t) {
       //if they're not the same length then they can't be anagrams 
        if (s.length() != t.length()){
            return false;
        }
        
        //bucket array to keep track of ASCII lower case alphabets/ characters 
        int[] bucket = new int[26];
        
        //incrementing index value of each character as we find them in our first string
        for (int i=0; i<s.length();i++){
            bucket[s.charAt(i) - 'a']++;
        }
        
        //decrementing index value of each character as we find them in our second string
        for (int i=0; i<t.length();i++){
            bucket[t.charAt(i) - 'a']--;
        }
        
        //if we have zero for every index in our bucket[] then it means every character in "s" was present in "t"
        for (int n: bucket){
            if (n != 0){
                return false;
            }
        }
        return true;
    }
}
