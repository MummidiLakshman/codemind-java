import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
                s+=i;
        }
        if(s==a)
        System.out.print("True");
        else
        System.out.print("False");
    }
}