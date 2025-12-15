class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        int i,j;
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                    return output;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Two_Sum solution = new Two_Sum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Output 1: [" + result[0] + ", " + result[1] + "]");

        nums = new int[]{3, 2, 4};
        target = 6;
        result = solution.twoSum(nums, target);
        System.out.println("Output 2: [" + result[0] + ", " + result[1] + "]");

        nums = new int[]{3, 3};
        target = 6;
        result = solution.twoSum(nums, target);
        System.out.println("Output 3: [" + result[0] + ", " + result[1] + "]");
    }
}