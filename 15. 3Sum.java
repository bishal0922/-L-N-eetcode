class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //This problem can be though of as the twoSum problem with a extra step
        //goal is to find triplets that sum up to 0
        //so for every number we find its complement (0-num[i]) then
        //we can apply the different two sum methods (hashmap || two pointers) to find the remaining two that sum to (0-num[i])
        //--the hashmap method does return duplicate triplets
        
        /*
        This problem can be though of as the twoSum problem with a extra step.
        Our goal is to find triplets that sum up to 0
        */
        
        //[-1,0,1,2,-1,-4]
        //[-4,-1,-1,0,1,2]
        
        //Sorting the int[] nums
        Arrays.sort(nums);
        
        //We create the return list
        List<List<Integer>> list = new ArrayList<>();
        
        //We iterate through every value in the int[] except the last index
        for (int i=0; i< nums.length-1;i++){
           //if the value at i isn't equal to i-1, except 0 as -1 index doesn't exist 
           if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
               
            //we declare our target along with the two pointers
            int target = 0-nums[i];
            int left= i+1; //i+1 as i would be part of target [i, __, __]
            int right = nums.length-1;
            
            while (left<right){
                //we found the triplet 
                if (nums[left]+nums[right] == target){
                    List<Integer> triplet = new ArrayList();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    list.add(triplet);
                
                //make sure we skip the duplicates     
                while (nums[left] == nums[left+1]){
                    left++;
                }
                while (nums[right] == nums[right-1]){
                    right--;
                }
                /*It can be confusing to why we move the pointers again as in the while loop and the code segment below this comment
                Imagine a section of code [2,2,2,4,5]
                The while loop above guarantees that the left pointer with be at the 3rd "2" and since 2 was already added as a triplet from 1st "2",
                We move our left pointer to "4" and then further begin our search
                In short, the while loop takes us to the last occurence and the code below makes sure pointer is infront of it. 
                */
                left++;
                right--;
                } else if (nums[left] + nums[right] > target){
                  //In the sorted array if the number is larger than target, It's the right pointer that needs to be moved as
                  //nums[left] always < nums[right]  
                    right--;
                } else{
                    left++;
                }
            }
        }
        }
        
        //return distinct triplets
        return list;
    }
}
