import java.util.Scanner;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,a,c=0,t=0,p=0,d=0,n,k;
        a=sc.nextInt();
        int[] x=new int[a];
        int[] arr=new int[100];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            if(x[i]%2!=0)
            {
                System.out.print("False");
                c+=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.print("True");
        }
    }
}