//LeetCode -> Array & Hashing

class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        To solve this question it is important to know what a sequence means
        In the array nums = [100,4,200,1,101,3,2], some sequences are [1,2,3,4] & [100,101] & [200]
        #Notice that the start of the sequence (1,100,200) never have a number behind (less than)
        #keep this concept of sequence start in mind
        */
        
        //adding all the elements of nums[] to our set
        Set<Integer> set = new HashSet<>();
        for (int n: nums){
            set.add(n);
        }
        
        int next;
        int best = 0;
        
        //iterating through the entire set (could be nums but set will guarantee unique values)
        for (int n: set){
            //the concept is applied here, if the number is a start of a sequence we can find the next values
            if (!set.contains(n-1)){
                //here "n" is the start of a sequence and next are the values consecutive to it
                next = n+1;
                
                //while the number has next consecutive values
                while (set.contains(next)){
                    next++;
                }
                //if the n was 5 and we find values until 8 then we know that the sequene was 5,6,7,8 -> 4 length 
                //the best variable will be updated as we find large sequences in the entire set               
                best = Math.max(best, next-n); 
                //OR best = (best>next-n) ? best: next-n; 
            }
        }
        return best;
    }
}
