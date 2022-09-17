import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,b,j,h=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int[] arr=new int[a];
        int[] brr=new int[b];
        int[] crr=new int[100];
        int[] drr=new int[200];
        int l=0,count=0,p,g=0,z=0,y=0,u;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(j=0;j<b;j++)
        {
            brr[j]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                if(brr[j]==arr[i])
                {
                    count+=1;
                }
            }
            if(count==0)
            {
                crr[l++]=arr[i];
            }
            count=0;
        }
        for(j=0;j<b;j++)
        {
            for(i=0;i<a;i++)
            {
                if(arr[i]==brr[j])
                {
                    g+=1;
                }
            }
            if(g==0)
            {
                crr[l++]=brr[j];
            }
            g=0;
        }
        drr[z++]=crr[0];
        for(i=0;i<l;i++)
        {
            for(u=0;u<z;u++)
            {
                if(drr[u]==crr[i])
                {
                    y+=1;
                }
            }
            if(y==0)
            {
                drr[z++]=crr[i];
            }
            y=0;
        }
        System.out.print(z);
        
    }
}