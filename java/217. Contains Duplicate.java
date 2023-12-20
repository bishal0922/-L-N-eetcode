//NeetCode -> Array & Hashing
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //creating a set 
        Set set = new HashSet();
        
        //iterate through the entire nums array
        for (int n: nums){
            if (set.contains(n)){
                return true;
            }
            set.add(n);
        }
        //false means that all elements were distinct
        return false;
    }
}
