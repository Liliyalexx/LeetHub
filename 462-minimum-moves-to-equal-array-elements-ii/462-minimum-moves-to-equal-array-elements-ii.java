public class Solution {
    public int minMoves2(int[] nums) {
        long min = Integer.MAX_VALUE;
        for (int num : nums) {
            long sum = 0;
            for (int n : nums) {
                sum += Math.abs(n - num);
            }
            min = Math.min(min, sum);
        }
        return (int) min;
    }
}