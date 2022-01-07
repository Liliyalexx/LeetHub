// class Solution {
//     int max = 0;
//     public int maxUniqueSplit(String s) {
//         int n = s.length();
//         backtrack(s, 0, new HashSet<String>());
//         return max;
//     }
//     public void backtrack(String s, int start, Set<String> h) {
//         if(start == s.length()) {
//             max = Math.max(max, h.size());
//         }
//         String res = "";
        
//         for(int i = start;i < s.length();i++) {
//             res += s.charAt(i);
//             if(h.contains(res)) continue;
//             h.add(res);
//             backtrack(s, i+1, h);
//             h.remove(res);
//         }
//     }
// }

class Solution {
    
    public int maxUniqueSplit(String s) {
        return helper(s, new HashSet());

    }
    
    private int helper(String s, Set<String> seen){
        int max = 0;
        for(int i = 1; i <= s.length(); i++) {
             String candidate = s.substring(0, i);
            if(!seen.contains(candidate)) {
            seen.add(candidate);
                max = Math.max(max, 1+helper(s.substring(i), seen));
                seen.remove(candidate);
                
                }
        
        }
        return max;
    }
}