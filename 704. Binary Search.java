//Ahaaa binary search

class Solution {
    public int search(int[] nums, int target) {
        //important that our array is sorted
        //binary search is O(log n)
        //our two pointers: left and right of the array
        int l = 0;
        int r = nums.length - 1;
        
        //while left is less than or equal to right
        while (l<=r){
            
            //we select the middle of the array
            int m = (l+r)/2;
            
            //if the number turns out to be the middle we return!
            if (nums[m] == target){
                return m;
            //if the number turns out to be greater than middle then we search the right (larger) side of the array
            } else if (nums[m] < target){
                l = m+1;
            //smaller if the number turns out to be less
            } else{
                r = m-1;
            }
        }
        
        //if we can't find it 
        return -1;
    }
}
