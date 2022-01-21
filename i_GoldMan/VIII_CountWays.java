package i_GoldMan;

public class VIII_CountWays {
	public int CountWays(String s)
    {
        // code here
        int m = 1000000007;
        int len = s.length();
        if(len==0 || s.charAt(0)=='0') return 0;
        if(len == 1)    return 1;
        long count1 = 1, count2 = 1;
        for(int i=1;i<len;i++){
            int a = s.charAt(i)-'0';
            int b = s.charAt(i-1)-'0';
            b*=10;
            b+=a;
            long count = 0;
            if(a>0) count+=count2%m;
            if(b>=10 && b<=26)  count+=count1%m;
            count1 = count2%m;
            count2 = count%m;
        }
        return (int)count2;
    }
}
