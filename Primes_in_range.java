import java.util.*;
class Code
{
    public static  boolean prime(int n)
    {
        int i;
        if(n<2)
            return false;
        for(i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,c=0,p;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<m+1;i++)
        {
            if(prime(i))
                c+=1;
        }
        System.out.print(c);
    }
}