public class roman_to_integer {
    public int romanToInt(String s) 
    {
        int i,k,n=0;
        for(i=0;i<s.length();i++)
        {
            System.out.println(n);
            k=(i<s.length()-1)?i+1:i;
            if(s.charAt(i)=='I'){
                if(s.charAt(k)=='V'){
                    n+=4;
                    i++;
                }else if(s.charAt(k)=='X'){
                    n+=9;
                    i++;
                }else{
                    n+=1;
                }
            }else if(s.charAt(i)=='V'){
                n+=5;
            }else if(s.charAt(i)=='X'){
                if(s.charAt(k)=='L'){
                    n+=40;
                    i++;
                }else if(s.charAt(k)=='C'){
                    n+=90;
                    i++;
                }else{
                    n+=10;
                }
            }else if(s.charAt(i)=='L'){
                n+=50;
            }else if(s.charAt(i)=='C'){
                if(s.charAt(k)=='D'){
                    n+=400;
                    i++;
                }else if(s.charAt(k)=='M'){
                    n+=900;
                    i++;
                }else{
                    n+=100;
                }
            }else if(s.charAt(i)=='D'){
                n+=500;
            }else if(s.charAt(i)=='M'){
                n+=1000;
            }
        }
        
        return n;
    }
}