class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> fMap = new HashMap();
        

        for(int number : nums){
            
            fMap.put(number, fMap.getOrDefault(number, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length +1];

        for(int key : fMap.keySet()){
            int frequency = fMap.get(key);

            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList();
            }
            buckets[frequency].add(key);
            
        }

        int[] aMap = new int[k];
        int index = 0;

        //Start from behind until k elements are added 

        for (int i = buckets.length - 1; i >= 0; i--){
            if(buckets[i] != null){
                
                for(int number : buckets[i]){
                    aMap[index++] = number;
                    if (index == k){
                        return aMap;
                    }
                }

            }
        }

        return aMap;


    }
}
