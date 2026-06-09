import java.util.*;
class pap
{

        public static void main (String args[])
        {
            Scanner sc = new Scanner (System.in);
            int n;
            int d;
            int s=0;

            System.out.println("ENTER ANY NUMBER");
            n=sc.nextInt();
              int temp=n;


            while(n>0)
            {
                d=n%10;
                s=s+(d*d*d);
                n=n/10;
            }
            if(temp==s)
            {
            System.out.println("NUMBER IS ARMSTRONG");
            }
            else
            {
                System.out.println("NUMBER IS NOT ARMSTRONG");
            }
 
        }
    }



    
