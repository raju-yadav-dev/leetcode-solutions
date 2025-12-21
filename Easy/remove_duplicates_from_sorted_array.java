public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) 
    {
        int i,k=0;
        for(i=1;i<nums.length;i++)
        {
            if(nums[k]<nums[i])
                nums[++k]=nums[i];
        }
        k++;//k is storing the index not the length or position so k++
        return k;
    }
}