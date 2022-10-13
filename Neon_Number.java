import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,p=0,s,t;
        t=n;
        d=n*n;
        while(d!=0)
        {
            s=d%10;
            p+=s;
            d=d/10;
        }
        if(t==p)
            System.out.print("Neon Number");
        else
            System.out.print("Not Neon Number");
    }
}