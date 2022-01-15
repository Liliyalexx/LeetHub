// class Solution {
//     public int findMinArrowShots(int[][] points) {
//         if (points.length == 0) return 0;

//         // sort by x_end
//         Arrays.sort(points, (o1, o2) -> {
//             // We can't simply use the o1[1] - o2[1] trick, as this will cause an 
//             // integer overflow for very large or small values.
//             if (o1[1] == o2[1]) return 0;
//             if (o1[1] < o2[1]) return -1;
//             return 1;
//         });

//         int arrows = 1;
//         int xStart, xEnd, firstEnd = points[0][1];
//         for (int[] p: points) {
//             xStart = p[0];
//             xEnd = p[1];
//             // if the current balloon starts after the end of another one,
//             // one needs one more arrow
//             if (firstEnd < xStart) {
//                 arrows++;
//                 firstEnd = xEnd;
//             }
//         }

//         return arrows;
//     }
// }

class Solution {
    public int findMinArrowShots(int[][] points) {


        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));

        int count = 1;
        if(points.length == 1) return 1;
        int[] prev = points[0];

        for(int i = 1; i< points.length ;i++){
            int s = points[i][0];
            int e = points[i][1];

            if(prev[1] < s){
                count++;
                prev[1] = e;
            }
            else{
                prev[1] = Math.min(e,prev[1]);
            }


        }

        return count;


    }
}