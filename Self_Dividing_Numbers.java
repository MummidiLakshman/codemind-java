import java.util.*;
class Code
{
    public static boolean div(int n)
    {
        int t,v=0,f,s;
        t=n;
        f=(int)Math.log10(n)+1;
       // System.out.print(f);
        while(n>0)
        {
            s=n%10;
            n=n/10;
            if(s==0)
            {
                continue;
            }
            else
            {
            if(t%s==0)
                v+=1;
            }
        }
        if(f==v)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        for(int i=n;i<=a;i++)
        {
            if(div(i))
                System.out.print(i+" ");
        }
    }
}