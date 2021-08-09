class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length; int n = nums2.length;
        int[]a = new int[m+n];
        int i=0,j=0, k=0;
        
        while(i<m && j<n){
        if (nums1[i]<nums2[j]){
            a[k++]=nums1[i++];
        } else{
            a[k++]=nums2[j++];
        }
        }
        while(i<m){
            a[k++]=nums1[i++];
        }
        while(j<n){
            a[k++]=nums2[j++];
        }
        
        int l = m+n-1;
        if((m+n)%2!=0){
            return a[l/2];
            
        }
        double a1=a[l/2], a2=a[(l/2)+1];
        return (a1+a2)/2;
    }
}