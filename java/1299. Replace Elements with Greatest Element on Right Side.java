class Solution {
    // public int[] replaceElements(int[] arr) {
    //     //there are a couple different approaches to this problem
    //     //the first brute force solution would be a O(n^2) approach where
    //         //for every number in the array you iterate through its right side then calculate the max and replace the given number with the computed max

    //     //second solution is a optimized O(n) solution where you iterate through the array from the end and update the parameter array in place by constantly updating the max value for every iteration

    //     //brute force solution (my initial non-optimized/ naive solution)
    //     //creating a new array and updating the position of the last element since there's nothign on the right side of the last number
    //     int[] re = new int[arr.length];
    //     re[arr.length -1 ] = -1;
    //     int ct= 0;
    //     //iterating through the number 1st pass
    //     for (int i =0 ; i < arr.length - 1; i++){
    //         //creating a new max variable for every value int the array
    //         int max = Integer.MIN_VALUE;
    //         //iterating through the next i+1 elements to update the max 
    //         for (int j = i+1; j<= arr.length - 1; j++){
    //             max = Math.max(max, arr[j]);
    //         }
    //         //adding the calculated max to the return array
    //         re[ct++] = max;
    //     }
    //     //returning the final array
    //     return re;
    // }

    //OPTIMIZED O(n) SOLUTION
    public int[] replaceElements(int[] arr){
        //this solution involves us iterating the array from the end and calculating/ updating the max as the given index of an array

        //this is the current high
        //this value will replace the last element in the array refer to the code for further explanation
        int high = -1;
        //reversing through the array
        int a;
        for (int i = arr.length -1 ; i >=0; i--){
            //a will serve as a placeholder variable to hold the copy for the element in the array
            a= arr[i];
            //now we have the copy of the number we can update it with your prev max i.e "high"
            arr[i] = high;
            //now we can update our high with the previous high and the now arr[i] number 
            high = Math.max(high, a);
        }

        //return the initial passed in array because we are not creating a ne return array and just updating the passed in array in plac
        return arr;
    }
}

