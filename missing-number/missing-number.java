

 class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        n=(n*(n+1))/2;//sum of n natural numbers
        int sum=0;
        //sum of array elements
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return n-sum;
    }
}


// class Solution{
// public int missingNUmber(int[] nums){
// int n = nums.length;
//     n=(n*(n+1))/2; //sum of natural numbers
//     int sum = 0;
//         //sum of array
//     for( int i =0; i< nums.length; i++){
//         sum+=nums[i];
//     }
//     return n-sum;
// }
// }
