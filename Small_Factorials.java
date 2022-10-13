import java.util.*;
class Code
{
    public static int fact(int a)
    {
        if(a==1)
        {
            return 1;
        }
        else
        {
            return a*fact(a-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            System.out.println(fact(a));
        }
    }
}