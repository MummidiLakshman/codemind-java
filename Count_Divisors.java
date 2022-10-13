import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                d+=1;
            }
        }
        System.out.print(d);
    }
}