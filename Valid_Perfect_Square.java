import java.util.*;
class Code
{
    public static boolean ps(int a)
    {
        for(int i=1;i<=a;i++)
        {
            if(i*i==a)
                return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            if(ps(b))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}