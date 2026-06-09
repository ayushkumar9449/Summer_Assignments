import java.util.*;
class c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b;
        int gcd=0;
        
        System.out.println("ENTER ANY TWO NUMBER");
        a=sc.nextInt();
        b=sc.nextInt();

        for(int i =1;i<=b ;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("HIGHEST COMMON DIVISOR :"+gcd);
    }
}