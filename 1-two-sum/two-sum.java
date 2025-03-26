class Solution {
    public int[] twoSum(int[] nums, int target) {
        int talla = nums.length; 
        int aux = 0; 
        int[] res = new int[2];
        int stop = 0; 

        for(int i=0;i<talla;i++){
            for(int j=1; j<talla; j++){
                 if(nums[i]+nums[j]==target && i!=j){
                 res[0]=i;
                 res[1]=j;
                 stop = 1; 
                 break;
                 }
            
             }
            if(stop==1){break;}
        }
    return res; 

    }
}