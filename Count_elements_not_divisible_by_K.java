import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int k,c=0;
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%k!=0)
            c+=1;
        }
        System.out.print(c);
    }
}