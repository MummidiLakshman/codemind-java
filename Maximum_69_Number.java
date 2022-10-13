import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=0,s,t,c=0,y=0;
       while(a!=0)
        {
            s=a%10;
            f=f*10+s;
            a=a/10;
        }
        while(f!=0)
        {
            t=f%10;
            if(t==6 && c==0)
            {
                t=9;
                c=1;
            }
            y=y*10+t;
            f=f/10;
        }
        System.out.print(y);
    }
}