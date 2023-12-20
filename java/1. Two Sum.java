//Neetcode -> Array & Hashing

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //The infamous two sum problem
        //brute force method is O(n^2) using nested loops
        //we are going to use the Hashmap method
        
        //creating our HashMap which stores <Number, it's Index>
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            
            //check if the target number can be reached (nums[i] + diff = target)
            if (map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            } 
            //adding the elements of the nums[] into the HashMap
            map.put(nums[i], i);
        }
        
        //we couldn't find the pair of indices
        return null;
    }
}
