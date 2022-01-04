// public class Solution {
//     public int minMoves2(int[] nums) {
//         long min = Integer.MAX_VALUE;
//         for (int num : nums) {
//             long sum = 0;
//             for (int n : nums) {
//                 sum += Math.abs(n - num);
//             }
//             min = Math.min(min, sum);
//         }
//         return (int) min;
//     }
// }

// public class Solution {
//     public int minMoves2(int[] nums) {
//         Arrays.sort(nums);
//         long min = Long.MAX_VALUE, sum = 0, total = 0;
//         for (int num : nums) {
//             total += num;
//         }
//         for (int i = 0; i < nums.length; i++) {
//             long ans = ((long) nums[i] * i - sum) + ((total - sum) - (long) nums[i] * (nums.length - i));
//             System.out.println(nums[i] + " " + ans);
//             min = Math.min(min, ans);
//             sum += nums[i];
//         }
//         return (int) min;
//     }
// }

public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int sum = 0;
        for (int num : nums) {
            System.out.println(num);
            
            sum += Math.abs(nums[nums.length / 2] - num);
           
            
        }
        return sum;
    }
}