class add_binary
{
    public String addBinary(String a, String b) 
    {
        int m=a.length(),n=b.length(),num1,num2;
        int carry=0;
        StringBuilder r = new StringBuilder();
        while(m>0 || n>0)
        {
            num1=(m!=0)?(a.charAt(--m))-'0':0;
            num2=(n!=0)?(b.charAt(--n))-'0':0;
            r.append(num1^num2^carry);
            carry=(num1+num2+carry>1)?1:0;
        }
        if(carry==1)
            r.append(carry);
        r.reverse();
        String result=r.toString();
        return result;
    }
}