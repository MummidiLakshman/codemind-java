import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,c=0,s,f,b;
        n=sc.nextInt();
        int a=sc.nextInt();
        b=(int)Math.log10(n)+1-a;
        f=n/(int)Math.pow(10,b);
        s=n%(int)Math.pow(10,a);
        m=Math.abs(f-s);
        System.out.print(m);
    }
}