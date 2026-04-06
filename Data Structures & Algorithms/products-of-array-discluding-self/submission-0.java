class Solution {
    public int[] productExceptSelf(int[] nums) {
        // to multiply the lefts and rigths
        int[] lefts = new  int[nums.length];
        int[] rights = new int[nums.length];

        // to store final products
        int[] prod = new int[nums.length];

        // we can set first elements to 1 since there will be no multiplication there
        // to eliminate running and extra 1 if for only 1 case
        lefts[0] = 1;
        rights[nums.length - 1] = 1;

        // go thru each number in array to calculate rest of the left and right products
        // start from 1 since we set the first elements by hand
        for(int i = 1; i < nums.length; i++){
            
            lefts[i] = lefts[i-1] * nums[i-1];
            rights[nums.length -1 -i] = rights[nums.length -i] * nums[nums.length -i]; 

        }

        for (int i = 0; i < nums.length; i++) {

            prod[i] = lefts[i] * rights[i];
        }


        return prod;



    }
}  
