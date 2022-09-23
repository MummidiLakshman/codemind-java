import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0,i;
        int n=sc.nextInt();
        int x[]=new int[n];
        //int arr[]=new int[100];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int p=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>=k && x[i]<=p)
            {
                System.out.print(x[i]+" ");
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
       /* else
        {
            System.out.println(min);
        }*/
        /*for(i=0;i<n;i++)
        {
            System.out.println(x[i]);
        }*/
        //System.out.println(k);
       // System.out.println(p);
    }
}