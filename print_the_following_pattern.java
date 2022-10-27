import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-1;j++)
            {
                System.out.print(j);
            }
            for(int k=n-3;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}