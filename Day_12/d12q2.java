import java.util.*;
class c
{
    void checkarm(int n)
    {
        int a=n,d;
        int temp=a;
        int sum=0;

        while(a>0)
        {
            d=a%10;
            sum = sum+(d*d*d);
            a=a/10;

        }
        if(sum==temp)
        {
            System.out.println(" ARMSTRONG NUMBER");
            
        }
        else
        {
            System.out.println("NOT  ARMSTRONG  NUMBER");
        }    
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ANY NUMBER");
        int a=sc.nextInt();

        c obj =  new c();
        obj.checkarm(a);
    }
        
    
    


}

