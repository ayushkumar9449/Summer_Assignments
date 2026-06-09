import java.util.*;
class AYUSh
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int sof=0;
        int d;
        int fact=1;

        System.out.println("ENTER ANY NUMBER :");
        n=sc.nextInt();
        int temp=n;

        while(n>0)
        {
            d=n%10;
            fact=1;
            for(int i=1;i<=d;i++)
            {
                fact=fact*i;
            }
            sof=sof+fact;
            n=n/10;
        }


        if(sof == temp)
        {
            System.out.println("STRONG NUMBER");
        }
        else
        {
            System.out.println("NOT A STRONG NUMBER");
        }


    }
}