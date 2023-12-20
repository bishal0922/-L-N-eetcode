//Neetcode -> Array & Hashing

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap to store our Strings
        HashMap<String, List<String>> map = new HashMap<>();
        
        //we iterate through all the strings in the strs[]
        for (int i=0; i<strs.length; i++){
            //Sorting every string - a sorted string will function as the key
            //a group of anagrams will have the same key (they're sorted and equal length)
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            
            if (!map.containsKey(sorted)){
                //creating a list if not present
                map.put(sorted, new ArrayList());
            }
            //adding our string to its group
            map.get(sorted).add(strs[i]);
        }
        
        //returning all the values (List<String>) within the map
        return new ArrayList(map.values());
    }
}
