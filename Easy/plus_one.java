public class plus_one {
    public int[] plusOne(int[] digits) 
    {
        if(digits[digits.length-1]<9)
        {
            digits[digits.length-1]+=1;
            return digits;
        }
        int i=digits.length-1;
        while(i>=0 && digits[i]==9)
        {
            digits[i--]=0;
        }
        if(i>=0)
        {
            digits[i]+=1;
            return digits;
        }
        else
        {
            digits = new int[digits.length+1];
            digits[0]=1;
            return digits;
        }
    }
}