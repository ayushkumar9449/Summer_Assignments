import java.util.*;
class c
{
    void checkfact(int n)
    {
       
        int sum=0;
        for(int i =1;i<=n-1;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
    {
       System.out.println("PERFECT NUMBER");
    }
    else
    {
        System.out.println("NOT A PERFECT NUMBER");
    }

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

