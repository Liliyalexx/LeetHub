class Solution {
    
    private List<List<Integer>> _subsets(int[] nums, int n) {
        if (n < 0) {
            List<List<Integer>> emptySet = new ArrayList<>();
            emptySet.add(new ArrayList<>());
            return emptySet;
        }
        List<List<Integer>> sets = _subsets(nums, n - 1);
        List<List<Integer>> result = new ArrayList<>(sets);
        for (List<Integer> set : sets) {
            List<Integer> copy = new ArrayList<>(set);
            copy.add(nums[n]);
            result.add(copy);
        }
        return result;
    }

    public List<List<Integer>> subsets(int[] nums) {
        return _subsets(nums, nums.length - 1);
    }
}