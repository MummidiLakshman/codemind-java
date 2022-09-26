import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,g,s=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c+=x[i];
        }
        g=c/n;
        for(i=0;i<n;i++)
        {
            if(x[i]==g)
                s+=1;
        }
        if(s==0)
            System.out.print("False");
        else
            System.out.print("True");
    }
}