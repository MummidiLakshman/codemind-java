import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,s=0,min=99999;
        float g;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<min)
                min=x[i];
        }
       // g=(float)c/n;
        System.out.print(min);
    }
}