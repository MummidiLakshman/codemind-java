import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s;
        n=sc.nextInt();
        s=(int)Math.sqrt(n);
        if(s*s==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}