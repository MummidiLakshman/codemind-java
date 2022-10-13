import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0,p=1,s;
        while(n!=0)
        {
            s=n%10;
            d+=s;
            p*=s;
            n=n/10;
        }
        if(d==p)
            System.out.print("Spy Number");
        else
            System.out.print("Not Spy Number");
    }
}