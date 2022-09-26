import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,g;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        g=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==g)
            {
                c+=1;
            }
        }
        if(c==0)
            System.out.print("0");
        else
            System.out.print(c);
    }
}