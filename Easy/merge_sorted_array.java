public class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,s1=m-1,s2=n-1;
        for(i=m+n-1;i>=0;i--)
        {
            if(s1>=0 && s2>=0){
                nums1[i]=(nums1[s1]<=nums2[s2])?nums2[s2--]:nums1[s1--];
            }
            else
                nums1[i]=(s1<0)?nums2[s2--]:nums1[s1--];
        }
    }
}