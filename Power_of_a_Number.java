import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,s,f;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(int)Math.pow(a,b);
        f=s%c;
        System.out.print(f);
    }
}