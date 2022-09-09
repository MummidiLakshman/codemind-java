import java.util.Scanner;
class avg
{
    public  static void main(String args[])
    {
        int a;
        int d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        d=(a*(a-1)/2);
        System.out.println(d);
     sc.close();
    }
}