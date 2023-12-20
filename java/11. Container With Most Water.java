//Neetcode -> Two Pointers
class Solution {
    public int maxArea(int[] height) {
        //this problem can be brute forced O(n^2) by comparing every height with every other height and calculating the max area
        //but this can also be solved in O(n) time using the double pointer method
        
        //declaring our pointers
        int left = 0;
        int right = height.length - 1;
        
        //our return area
        int area = 0; 
        
        while (left < right){
            //calculating area of two different heights from the pointers
            //Area = length (different of the indices) * width (lesser of the two heights)
            area = Math.max(area, (right-left)*(Math.min(height[left], height[right])));
            
            //Here we are going to move the pointer (height) that is the smallest!
            /*
            It is because we want to find the highest height possible
            also because if we move the hightest height instead of the smallest it is impossible to get a 
            larger value than the one current even if the next height is larger than the other pointer
            */
            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        //returning area as it guarantees the largest possible value
        return area;
    }
}
