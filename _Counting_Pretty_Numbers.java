import java.util.*;
class code
{
   /* public static boolean cp(int a)
    {
        while(a!=0)
        {
            s=n%10;
            n=n/10;
            if(s==2 || s==3 || s==9)
            return 1
        }
    }*/
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0,s,d,h=0;
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int j=a;j<=b;j++)
            {
                s=j%10;
                if(s==2 || s==3 || s==9)
                f+=1;
            }
           System.out.println(f);
           f=0;
        }
       // System.out.println(h);
    }
}