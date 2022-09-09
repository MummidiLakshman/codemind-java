import java.util.Scanner;
class avg
{
    public  static void main(String args[])
    {
        int a,b;
        float d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        d=(float)(a+b)/2;
        System.out.format("%.4f",d);
     sc.close();
    }
}