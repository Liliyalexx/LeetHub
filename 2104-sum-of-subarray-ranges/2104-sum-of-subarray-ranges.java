class Solution {
    public long subArrayRanges(int[] nums) {
        long total =0;
        
        for(int i = 0; i < nums.length-1; i++){
             int max = nums[i];
             int min = nums[i];
            for( int j = i+1; j < nums.length; j++){
                
                if( nums[j]<min){
                    min=nums[j];
                }
                if( nums[j]> max){
                    max=nums[j];
}
                
                total+=max-min;
            }
            
            
        }
        return total;
        
        
    }
}