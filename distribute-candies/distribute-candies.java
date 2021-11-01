class Solution {
    public int distributeCandies(int[] C) {
        Set<Integer> cset = new HashSet<>();
        for (int c : C) cset.add(c);
        return Math.min(cset.size(), C.length / 2);
    }
}