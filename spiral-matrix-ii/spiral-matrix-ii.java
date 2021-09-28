class Solution {
    public int[][] generateMatrix(int n) {


        int [][] matrix  = new int [n][n];

        int top =0, bottom = n-1, left = 0, right = n-1;
        int count=0;
        int dir = 0;
        int i =0, j=0;

        while(count<n*n){

            if(dir == 0){
                matrix[i][j] = count+1;
                j++;
                if(j==right){
                    dir =1;
                    top++;
                }

            }

            else if(dir == 1){
                matrix[i][j] = count+1;
                i++;
                if(i==bottom){
                    dir = 2;
                    right--;
                }

            }
           else  if(dir == 2){
                matrix[i][j] = count+1;
                j--;
                if(j==left){
                    dir =3;
                    bottom--;
                }

            }
           else  if(dir == 3){
                matrix[i][j] = count+1;
                i--;
                if(i==top){
                    dir =0;
                    left++;
                }

            }



            System.out.println(Arrays.deepToString(matrix));
            count++;
        }
        System.out.println(Arrays.deepToString(matrix));
        return matrix;

    }
}