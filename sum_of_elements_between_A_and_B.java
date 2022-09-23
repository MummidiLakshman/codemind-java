import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int u=0,min=0,c=0,i;
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
                  min+=x[i];
        }
            System.out.println(min);
        /*for(i=0;i<n;i++)
        {
            System.out.println(x[i]);
        }*/
        //System.out.println(k);
       // System.out.println(p);
    }
}