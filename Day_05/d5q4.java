import java.util.*;
class qwe
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sod=0;
        int n;
        int count=0;
        

        System.out.println("ENTER ANY NUMBER :");
        n=sc.nextInt();
        int temp=n;
        int max=1;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                  count=0;

                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                          count++;
                    }
                }
                if(count == 2)
                {
                     max=Math.max(max, i);
                }

            }
        }

        System.out.println("LARGEST PRIME FACTOR :"+max);

       
            
    }
    
}