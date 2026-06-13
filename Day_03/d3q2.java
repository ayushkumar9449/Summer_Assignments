import java.util.*;
class x
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int f,l;
        int count=0;

        System.out.println("ENTER RANGE ");
        f=sc.nextInt();
        l=sc.nextInt();

        for(int i =f;i<=l;i++)
        {
            count =0;
            for( int j=1;j<=l;j++)
            {
                 if(i%j==0)
                 {
                    count++;
                 }
                 
            }
            if(count ==2)
                 {
                    System.out.println("PRIME NUMBER :"+i);
                 }
        }
    }
}