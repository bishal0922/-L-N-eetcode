//Neetcode - Two Pointer

class Solution {
    public int trap(int[] height) {
        /*
        To find out how much water can be trapped, it is important to know how water is trapped
        if index i has a building of height[i], then water can be trapped if:
            The lower of the building to its left or right is less than the height[i] 
                -> min(height[left], height[right]) < height[i]
            How much water trapped? its the difference of lowest left/right height and the height[i]
                -> min(height[left], height[right]) - height[i]
        Here, I implement a two pointer method to calculate the max height at left and right given a position i
        and then further calculate the actual water trapped.
        SOLUTION 2: https://leetcode.com/submissions/detail/792533678/
        */
        
        //declaring the two pointers
        int l = 0;
        int r = height.length -1;
        //setting max heights 
        int leftMax = height[l];
        int rightMax = height[r];
        //return result
        int res = 0;
        
        while (l<r){
            //here for the conditionals we want to move the lower height between left and right 
            //it is because the amount of water trapped is always limited by the lower not the higher height where it'd spill
            
            //moving the lower height and then we check the possibility of updating it 
            //then adding the difference (unit of water collected)
            if (leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}
