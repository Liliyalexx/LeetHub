class Solution {
    public int numTimesAllBlue(int[] light) {
        int c=0;
        int k=0;
        int ans=0;
        for(int i=0;i<light.length;i++){
            c+=light[i];
            k+=i+1;
            if(c==k)
                ans++;
        }
        return ans;
    }
}