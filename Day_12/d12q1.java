import java.util.*;
class c
{
    void checkpalin(int n)
    {
        int a=n,d;
        int temp=a;
        int sum=0;

        while(a>0)
        {
            d=a%10;
            sum = sum*10+d;
            a=a/10;

        }
        if(sum==temp)
        {
            System.out.println("PALINDROME NUMBER");
        }
        else
        {
            System.out.println("NOT PALINDROME NUMBER");
        }    
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ANY NUMBER");
        int a=sc.nextInt();

        c obj =  new c();
        obj.checkpalin(a);
    }
        
    
    


}

