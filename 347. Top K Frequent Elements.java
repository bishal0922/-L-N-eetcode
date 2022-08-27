class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //return array because we know it's size k
        int[] r = new int[k];
        
        Map<Integer, Integer> map = new HashMap<>();
        //iterating through the nums[] and keeping track of <Num, frequency> in the HashMap
        for (int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        //bucket array of our frequencies 
        //nums.length+1 as we might get a array of size 3 w/ same values (3freq would be an index so need size 4)
        List<Integer>[] bucket = new List[nums.length+1]; 
        
        //now we have to add the values of our HashMap frequencies to our bucket int array;
        for (Integer key: map.keySet()){
            if (bucket[map.get(key)] == null){
                bucket[map.get(key)] = new ArrayList();
            }
            bucket[map.get(key)].add(key);
        }
        
        //now we have a bucket array with [frequency] -> List of numbers
        int ct= 0;
        //highest -> lowest iteration
        for (int i=(bucket.length)-1; i>=0; i--){
            if (bucket[i] != null){
                //if the given frequency has a list of numbers then we add them to the return[]
                for (int j=0; j<bucket[i].size();j++){
                    r[ct] = bucket[i].get(j);
                    ct++;
                }
                //if the ct exceeds k, then we stop (note this is out of the scope for the nested loop)
                if (ct == k){
                    break;
                }
                
            }
        }
        
     
      return r;
    }
}
