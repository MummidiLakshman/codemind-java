import java.util.*;
class code
{
    public static boolean sp(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i*i==n)
                return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(sp(x[i]))
            {
                s+=x[i];
            }
        }
        System.out.print(s);
        //for(int i=0;i<n;i++)
        //System.out.print(x[i]);
    }
}