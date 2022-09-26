import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float g;
        n=sc.nextInt();
        g=(float)((n-32)/1.8);
        System.out.printf("%.2f",g);
    }
}