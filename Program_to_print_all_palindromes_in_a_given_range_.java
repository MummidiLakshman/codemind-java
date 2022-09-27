import java.util.*;
class Code
{
    public static boolean pal(int n)
    {
        int s,d,f=0;
        s=n;
        while(n!=0)
        {
            d=n%10;
            f=f*10+d;
            n=n/10;
        }
        if(s==f)
            return true;
        else
            return false;
    }
    /*public static  boolean prime(int n)
    {
        int i;
        if(n<2)
            return false;
        for(i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;*/
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,c=0,p;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<m+1;i++)
        {
            if(pal(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}