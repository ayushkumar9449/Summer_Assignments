import java.util.*;
class fact
{

    int sod(int n)
    {

        int sum=0;
        int d;
        if(n==0)
        {
            return 0;
        }
        else
        {
            d=n%10;
            sum=sum+d;
            return(sum + sod(n/10));
        }


        
                
            
        }
        public static void main (String args[])
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("ENTER ANY NUMBER :");
            int c=sc.nextInt();

            fact obj = new fact();
            int v=obj.sod(c);

            System.out.println("SUM OF DIGIT :"+v);

        
    }
}