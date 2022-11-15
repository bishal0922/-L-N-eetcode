class Solution {
    public int removeDuplicates(int[] nums) {
        //This question is very poorly worded 
        //what we are doing is just removing the duplicated easy!
        //initial idea is that as I iterate through the array if i see duplicates i only add one instance of those numbers

        //initial number/ pointer
        //here we skip the first index because the first index will always be the first instance of a number (as it is sorted)
        int ptr =1 ;

        //iterating through the number starting from the second index
        for (int i = 1; i < nums.length; i++){
            //if the given number isn't the same as the previous then we have reached the first instance (if theres more duplicates ahead) of the new number
            if (nums[i-1] != nums[i]) {
                //we add the new found unique number to the early indicesparts of the array
                nums[ptr++] = nums[i];
            }
        }

        //return the length of the unique numbers
        //solution is O(n) time and O(1) space
        return ptr;


        //FAILED ATTEMPT
        // // Input: nums = [0,0,1,1,1,2,2,3,3,4]
        // // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        // Set set = new HashSet();
        // int ptr = 0;
        // for (int i = 0; i < nums.length ; i++)
        // {
        //     if (!set.contains(nums[i])){
        //         set.add(nums[i]);
        //         nums[ptr++] = nums[i];
        //     }

        // }

        // for (int i= set.size(); i < nums.length; i++){
        //     nums[i] = -1;
        // }
        // System.out.println(Arrays.toString(nums));
        // return set.size();
    }
}
