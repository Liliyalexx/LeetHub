class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int dir =0;
        int length = matrix.length;
        int width = matrix[0].length;
        int up =0, down =length-1, right = width-1, left = 0;
        int r =0, c = 0;
        List<Integer> list = new ArrayList<>();
        while(list.size() < length*width){

            if(dir == 0){
                r = up;
                for(int i=left; i<=right; i++){
                    list.add(matrix[r][i]);
                }
                up++;
                dir=1;
            }
            else if(dir == 1){
                c = right;
                for(int i=up; i<=down; i++){
                    list.add(matrix[i][c]);
                }
                right--;
                dir = 2;
            }
            else if(dir == 2){
                r = down;
                for(int i=right; i>=left; i--){
                    list.add(matrix[r][i]);
                }
                down--;
                dir = 3;
            }
            else if(dir == 3){
                c = left;
                for(int i=down; i>=up; i--){
                    list.add(matrix[i][c]);
                }
                left++;
                dir=0;
            }
        }
        return list;
    }
}