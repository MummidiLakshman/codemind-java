import java.util.*;
class code
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float s=0;
        for(int i=1;i<=n;i++)
        {
            s+=(float)1/i;
        }
        System.out.printf("%.2f",s);
    }
}