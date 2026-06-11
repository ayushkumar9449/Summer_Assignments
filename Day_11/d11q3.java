package Day_11;
import java.util.*;
class o
{
    public void prime (int a)
    {
        int c=0;
        for(int i =1;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("PRIME NUMBER :");
        }
        else
        {
            System.out.println("PRIME NUMBER NO :");
        }
    }

    public static void main(String args[])
    {
        o obj=new o();
        obj.prime(13);

    }
}