class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int arr[] = new int[2];
        for( int i=0; i<nums.length; i++){
        
        if (map.containsKey(target-nums[i])){
        arr[0] = i;
        arr[1] = map.get(target-nums[i]);
        }
        map.put(nums[i], i);
     }
    return arr;
    }
}
