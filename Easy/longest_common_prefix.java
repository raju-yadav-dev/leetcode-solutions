class longest_common_prefix
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==1)
            return strs[0];
        if(strs==null || strs.length==0)
            return "";
        int l=strs[0].length(),i,j;
        String st="";
        for(i=1;i<strs.length;i++)
            l=Math.min(strs[i].length(),l);
        
        for(i=1;i<=l;i++)
        {
            st=strs[0].substring(0,i);
            for(j=1;j<strs.length;j++)
            {
                if(!(st.equals(strs[j].substring(0,i))))
                {
                    return(strs[0].substring(0,i-1));
                }
            }
        }
        return st;
    }
}