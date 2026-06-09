import java.util.*;
class pa
    {
        public static void main (String args[])
        {
            Scanner sc = new Scanner (System.in);
            int a=0;
            int b=1;
            int c;
            System.out.println("ENTER THE RANGE");
            int r= sc.nextInt();
            System.out.println(+a);
          System.out.println(+b);


            for(int i=0;i<=r;i++)
            {
                  c=a+b;
                 System.out.println(+c);
                 a=b;
                 b=c;

            }
        }


    }
