class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        //turning the color string to character array, takes O(n) but we can just use charAt() method
        char[] ch = colors.toCharArray();
        
        //return value
        int cost = 0;
        
        //loop through the entire string array
        for (int i =0; i<ch.length; i++){
            
            //if an element is the same as the element behind it 
            if (i>0 && ch[i] == ch[i-1]){
                
                //then we add the minimum cost of the two similar elements to the total
                cost+= Math.min(neededTime[i], neededTime[i-1]);
                
                //them we update the given cost array in the function at index of the ith element (walk through a sequence with >3 same color ballons)
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
            }
     
        }
        
        //then we return the minimum cost        
        return cost;
    }
}
