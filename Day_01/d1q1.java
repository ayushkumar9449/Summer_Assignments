import java.util.*;
class xyz
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ANY NUMBER");
        int n= sc.nextInt();

        int sum=0;

        for(int i=0;i<=n;i++)
        {
            sum+=i;
        }
            
        System.out.println("ANSWER :"+sum);

            
    }
}
