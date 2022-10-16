import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int i,j,c=0,d=0,g=0;
        int x[]=new int[3];
        int y[]=new int[3];
        for(i=0;i<x.length;i++)
        x[i]=sc.nextInt();
        for(i=0;i<y.length;i++)
        y[i]=sc.nextInt();
        for(i=0;i<x.length;i++)
        {
            if(x[i]==y[i])
                c+=1;
            else if(x[i]>y[i])
                d+=1;
            else
                g+=1;
                
        }
        System.out.println(d+" "+g);
    }
}