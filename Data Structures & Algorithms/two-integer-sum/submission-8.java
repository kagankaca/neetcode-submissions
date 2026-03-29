class Solution {
    public int[] twoSum(int[] nums, int target) {
        int goal;
        int[] toReturn = new int[2];
        for (int i = 0; i < nums.length; i++){

            goal = target - nums[i];
            
            for(int j = i+1; j < nums.length; j++){
                if( nums[j] == goal){
                    toReturn[0] = i;
                    toReturn[1] = j;
                
                }
            } 

        }
        return toReturn;
    }
}
