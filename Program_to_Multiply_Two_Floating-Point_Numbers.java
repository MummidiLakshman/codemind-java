import java.util.Scanner;
class avg
{
    public  static void main(String args[])
    {
        float a,b;
        float d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        d=(float)(a*b);
        System.out.format("%.2f",d);
     sc.close();
    }
}