import java.util.*;
class Code
{
    public static int digit(int a)
    {
        int d,f=0;
        while(a!=0)
        {
            d=a%10;
            f+=d;
            a=a/10;
        }
        return f;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,d;
        int a=sc.nextInt();
        while(a>9)
        {
            a=digit(a);
        }
        System.out.print(a);
    }
}