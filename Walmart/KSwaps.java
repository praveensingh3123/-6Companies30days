package Walmart;

public class KSwaps {
    private static String res="";
    public static String findMaximumNum(String str, int k)
    {
        res=str;
        helper(str.toCharArray(),k,0);
        return res;
    }

    public static void helper(char[] str,int k,int idx)
    {
        if(k==0||idx==str.length)
        {
            String temp=new String(str);
            if(res.compareTo(temp)<0)
            {
                res=temp;
            }
            return;
        }
        char max=str[idx];
        for(int i=idx+1;i< str.length;i++)
        {
            if(str[i]>max)
            {
                max=str[i];
            }
        }
        if(max!=str[idx])
        {
            k--;
        }

        for(int i=idx;i<=str.length-1;i++)
        {
            if(str[i]==max)
            {
                swap(str,idx,i);
                helper(str,k,idx+1);
                swap(str,i,idx);
            }
        }

    }
    public static void swap(char []str,int i,int j)
    {
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
        return;
    }
}
