class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        for(int n = left; n<=right; ++n){
        if (selfDividing(n)) list.add(n);
        
    } 
        return list;
}

public boolean selfDividing (int n){
    for(char c: String.valueOf(n).toCharArray()){
        if (c=='0' || (n % (c - '0') > 0)) 
            return false;
              
    }
    return true;
}
}
