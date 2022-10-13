import java.util.*;
class Code
{
    public static boolean prime(int a)
    {
        if(a<2)
        {
            return false;
        }
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        for(int i=1;i<100;i++)
        {
            if(prime(c+i))
            {
                System.out.print(i);
                break;
            }
        }
    }
}