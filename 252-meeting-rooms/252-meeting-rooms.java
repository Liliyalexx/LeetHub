// class Solution {
//     public boolean canAttendMeetings(int[][] intervals) {
//         for (int i = 0; i < intervals.length; i++) {
//             for (int j = i + 1; j < intervals.length; j++) {
//                 if (overlap(intervals[i], intervals[j])) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     private boolean overlap(int[] interval1, int[] interval2) {
//         return (interval1[0] >= interval2[0] && interval1[0] < interval2[1])
//             || (interval2[0] >= interval1[0] && interval2[0] < interval1[1]);
//     }
// }

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }
        return true;
    }
}


