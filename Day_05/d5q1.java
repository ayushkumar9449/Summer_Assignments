import java.util.*;
class q
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sod=0;
        int n;
        

        System.out.println("ENTER ANY NUMBER :");
        n=sc.nextInt();
        int temp=n;

        for(int i=1;i<=n-1;i++)
        {
            if(n%i==0)
            {
                sod = sod + i;
            }
        }

        if(sod==n)
        {
            System.out.println("PERFECT NUMBER");

        }
        else
        {
            System.out.println("NOT A PERFECT NUMBER");
        }
        
            
    }
    
}

