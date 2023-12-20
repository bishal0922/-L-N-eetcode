//Neetcode -> Array & Hashing

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //one possible way is to generate the total product of all the numbers in nums[] 
        //then returning the total product/nums[i] for every i in the return array
        
        //other solution for O(n) time while minimizing memory resource is as follows
        //An Example: 
        //Input: nums = [1,2,3,4]
        //Output: [24,12,8,6]
        
        //return array as we know its size nums.length
        int[] r = new int[nums.length];
        int prefix = 1, postfix = 1;
        
        for (int i=0; i<nums.length; i++){
            r[i] = prefix;
            prefix*= nums[i];
        }
        //the above loop makes r={1,1,2,6} -> this can be the "prefix array"
        
        for (int i=nums.length-1; i>=0; i--){
            r[i] *= postfix;
            postfix *= nums[i];
        }
        //the above loop multiples the initial r={1,1,2,6} by {24,12,4,1} OR "postfix array"
        //thus generating our desired output [24,12,8,6]
        
        return r;
    }
}
