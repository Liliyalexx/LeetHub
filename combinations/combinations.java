class Solution {
    List<List<Integer>> lists;
    public List<List<Integer>> combine(int n, int k) {
        lists = new ArrayList();
        List<Integer> temp = new ArrayList<>();
        recursion(temp,n,k,1);
        return lists;
    }
    void recursion(List<Integer> temp,int n,int k,int start)
    {
        if(temp.size() == k)
        {
            lists.add(new ArrayList(temp));
            return ;
        }
        for(int i=start;i<=n;i++)
        {
            temp.add(i);
            recursion(temp,n,k,i+1);
            temp.remove(temp.size()-1);
        }
    }
}