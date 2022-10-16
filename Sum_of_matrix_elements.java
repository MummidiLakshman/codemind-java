import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int i,j,m,n,s=0,d=0,g=0;
        m=sc.nextInt();
        n=sc.nextInt();
        int x[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               s+=x[i][j];
            }
        }
        System.out.print(s);
    }
}