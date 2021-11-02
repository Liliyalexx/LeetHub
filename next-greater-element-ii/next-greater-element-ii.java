class Solution {
    
    public int[] nextGreaterElements(int[] nums) {
     
        Stack<Integer> stack = new Stack<>();
        
        int[] result = new int[nums.length];
        
        process(nums, result, stack, true);
                
        process(nums, result, stack, false);  
        
        while (!stack.isEmpty()) {
            
            result[stack.pop()] = -1;
        }
        
        return result;
    }
    
    private void process(int[] nums, int[] result, Stack<Integer> stack, boolean push) {
        
        for (int i = 0; i < nums.length; i++) {
            
           while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                    
                result[stack.pop()] = nums[i];
            }
                
            if (push)
            stack.push(i);
        }
    }
}