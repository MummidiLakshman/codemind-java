import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int a,b,c;
        float s,f;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        f=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",f);
        sc.close();
    }
}