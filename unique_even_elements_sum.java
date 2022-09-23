import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0,i,h=0,p=0,f=0,j;
        int n=sc.nextInt();
        int x[]=new int[n];
        //int arr[]=new int[100];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(x[i]==x[j])
                    f+=1;
            }
        if(f==0)
        {
            if(x[i]%2==0)
            {
                h+=x[i];
            }
            
        }
        f=0;
        }
        System.out.print(h);
    }
}