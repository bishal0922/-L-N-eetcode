//Neetcode -> Two pointers

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //this can be also solved using the same method for original two sum by implmenting HashMap 
        //this method is going to be a double pointer approach
        
        //declaring pointers
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right){
            //if our total is greater than our target then the larger of the two is too large 
            if (numbers[left] + numbers[right] > target){
                right--;
            //if the total is less then we increment the smaller of the two 
            } else if (numbers[left] + numbers[right] < target){
                left++;
            //if it isn't smaller or greater then its equal to target
            } else
                return new int[] {left+1, right+1};  
        }
        return null;
    }
}
