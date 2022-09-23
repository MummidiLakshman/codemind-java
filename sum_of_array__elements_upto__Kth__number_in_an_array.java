import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0,i,h=0,p=0,f=0,j;
        int n=sc.nextInt();
        int x[]=new int[n];
        //int arr[]=new int[100];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<=k)
            {
                h+=x[i];
            }
        }
        System.out.print(h);
    }
}