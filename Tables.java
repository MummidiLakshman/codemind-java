import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,c=0,s,f,b;
        n=sc.nextInt();
        int a=sc.nextInt();
        for(int i=1;i<=a;i+=2)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}