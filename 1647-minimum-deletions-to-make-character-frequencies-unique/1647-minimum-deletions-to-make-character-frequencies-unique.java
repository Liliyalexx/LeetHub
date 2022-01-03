class Solution {
public int minDeletions(String s) {
	int freq[] = new int[26];
	for (char c : s.toCharArray())
		freq[c - 'a']++;
	Arrays.sort(freq);
	int keep = freq[25], prev = keep;
	for (int i = 24; i >= 0 && freq[i] != 0 && prev != 0; i--) {
		prev = Math.min(freq[i], prev - 1);
		keep += prev;
	}
	return s.length() - keep;
}
}

// class Solution {
//     private int N = 26;
//     public int minDeletions(String s) {
//         int[] array = new int[N];
//         for (char ch : s.toCharArray()) {
//             array[ch - 'a']++;
//         }
//         int ans = 0;
//         Set<Integer> set = new HashSet<>();
//         for (int i : array) {
//             if (i == 0) continue;
//             while (set.contains(i)) {
//                 i--;
//                 ans++;
//             }
//             if (i != 0) {
//                 set.add(i);
//             }
//         }
//         return ans;
//     }
// }