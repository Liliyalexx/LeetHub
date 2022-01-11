class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> nums = new ArrayList<>();
      if(matrix == null || matrix.length == 0)  {
        return nums;
      }

      int top =0; // top row travers 
      int bottom = matrix.length - 1; // bottom, we includ all 
      int left = 0;  // left most column
      int right = matrix[0].length - 1; //rigth column
      int size = matrix.length * matrix[0].length; //all number that we need


      while (nums.size() < size) {
         for (int i = left; i <= right && nums.size() < size; i++){ // ad checking
           nums.add(matrix[top][i]);
         }
         //not to count numbers twice
         top++;

        for (int i = top; i<= bottom && nums.size() < size; i++){ //
           nums.add(matrix[i][right]);//right column
         
         }
         right--; //not to repeat numbers

         for(int i=right; i>=left && nums.size() < size; i--){

          nums.add(matrix[bottom][i]);
         }
         bottom --;
         for ( int i = bottom; i>= top && nums.size() < size; i--){
           nums.add(matrix[i][left]);
         }
         left++;
      }
      return nums;
  }
}