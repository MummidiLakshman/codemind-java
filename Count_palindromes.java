import java.util.Scanner;
class Code
{
    public static boolean pal(int a)
    {
        int s,f=0,d;
        s=a;
        while(a!=0)
        {
            d=a%10;
            f=f*10+d;
            a=a/10;
        }
        if(f==s)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,h=0;
        a=sc.nextInt();
        int[] arr=new int[a];
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            if(pal(arr[i]))
            {
                h++;
            }
        }
        System.out.println(h);
        sc.close();
    }
}