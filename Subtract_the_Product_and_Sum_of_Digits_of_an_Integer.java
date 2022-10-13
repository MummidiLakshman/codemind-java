import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0,p=1,f,d;
        while(a!=0)
        {
            d=a%10;
            s+=d;
            p*=d;
            a=a/10;
        }
        f=Math.abs(s-p);
        System.out.print(f);
    }
}