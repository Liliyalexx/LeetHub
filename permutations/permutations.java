class Solution {
  public List<List<Integer>> permute(int[] nums) {
      
      List<List<Integer>> ans = new ArrayList<List<Integer>>();
      
      permute(nums, 0, ans);
      
      return ans;
      
  }
  private void permute(int[] nums, int idx, List<List<Integer>> ans){
      
      if(idx==nums.length){
          
          List<Integer> temp = new ArrayList<Integer>();
          
          for(int i=0;i<idx;i++){
              
              temp.add(nums[i]);
          }
          
          ans.add(temp);
          
          return;
      }
      
      for(int i=idx; i < nums.length; i++){
          
          swap(nums, idx, i);
          
          permute(nums, idx+1, ans);
          
          swap(nums, idx, i);
      }
      
      
  }
  private void swap(int[] a, int i, int j){
      
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
  }
}