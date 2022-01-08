// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         Integer[] chars = new Integer[128];
        
//         int left = 0;
//         int right = 0;
        
//         int res = 0;
        
//         while(right < s.length()){
//            char r = s.charAt(right);
//             char[r]++;
            
//             Integer index = chars[r];
            
//             if(index !=null && index >= left && index < right ) left = index + 1;
                    
//             res = Math.max(res, right - left +1);
            
//             chars[r] = right;
            
//             right ++;
//             }
        
//         return res;
//     }
// }

//Time: O(n)
//Space: O(m)

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}