public class palindrome_number {
    public boolean isPalindrome(int x) 
    {
        if(x<0)
            return false;
        int n=x,s=0;
        while(n!=0)
        {
            s=s*10+n%10;
            n/=10;
        }
        if(s!=x)
            return false;
        return true;
    }
    public static void main(String[] args)
    {
        palindrome_number palindrom = new palindrome_number();
        System.out.println(palindrom.isPalindrome(121));
        System.out.println(palindrom.isPalindrome(-121));
        System.out.println(palindrom.isPalindrome(10));
    }
}
