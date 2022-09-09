import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int a;
        float r;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        r=(float)((3.14)*a*a);
        System.out.format("%.2f",r);
        sc.close();
    }
}