import java.util.*;
class xa
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n;

        System.out.println("ENTER ANY NUMBER THAN ITZ POWER :");
        x=sc.nextInt();
        n=sc.nextInt();
        int prod=1;

        for(int i=1;i<=n;i++)
        {
              prod=prod*x;
        }

        System.out.println("ANSWER :"+prod);


        
    }
}
