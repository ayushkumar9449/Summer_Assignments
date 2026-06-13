import java.util.*;
class c
{
    void checkfact(int n)
    {
       
        int fact=1;
        for(int i =1;i<=n;i++)
        {
            fact = fact*i;
        }

       System.out.println("FACTORIAL :"+fact);

    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ANY NUMBER");
        int a=sc.nextInt();

        c obj =  new c();
        obj.checkfact(a);
    }
        
    
    


}

