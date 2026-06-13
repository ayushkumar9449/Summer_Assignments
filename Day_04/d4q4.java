import java .util.*;
class w
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int first,last,count=0;
        int d,sum=0;
        System.out.println("ENTER RANGE :");
        first = sc.nextInt();
        last = sc.nextInt();


        for(int i=first;i<=last;i++)
         {
            int x=i;
            int y=i;
            count=0;
            sum=0;
            while(x>0)
            {
                 count++;
                 x=x/10;
            }
            while(y>0)
            {
                d=y%10;
                sum = sum + (int)(Math.pow(d,count));
                y=y/10;

            }
            if(sum == i)
            {
                System.out.println("ARMSTRONG NO :"+i);
            }
        }

    }
}