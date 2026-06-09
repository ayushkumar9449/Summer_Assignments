import java .util.*;
class f
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int count=0;

        System.out.println("ENTER ANY NUMBER ");
        n = sc.nextInt();

        for(int i =1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count ==2)
        {
           System.out.println("PRIME NUMBER ");

        }
        else
        {
            System.out.println("NOT A PRIME NUMBER");

        }
        
    }
}