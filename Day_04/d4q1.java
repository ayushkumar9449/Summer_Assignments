import java.util.*;
class p
    {
        public static void main (String args[])
        {
            Scanner sc = new Scanner (System.in);
            int a=0;
            int b=1;
            int c;
            System.out.println(+a);
          System.out.println(+b);


            for(int i=0;i<=5;i++)
            {
                  c=a+b;
                 System.out.println(+c);
                 a=b;
                 b=c;

            }
        }


    }
