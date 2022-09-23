import java.util.*;
class code
{
    public static boolean prime(int n)
    {
        int i;
        if(n<2)
        {
            return false;
        }
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,d=0,c=0,p=0,j,f=0,h=0;
        n=sc.nextInt();
        int x[]=new int[n];
        int dr[]=new int[100];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(prime(x[i]))
            {
                dr[p++]=x[i];
            }
        }
        //s=(float)d/c;
        //System.out.print(c);
        for(i=0;i<p;i++)
        {
            for(j=i+1;j<p;j++)
            {
                if(dr[i]==dr[j])
                {
                    f+=1;
                }
            }
            if(f==0)
            {
                if(dr[i]<=k)
                    h+=1;
            }
            f=0;
        }
        System.out.println(h);
    }
}