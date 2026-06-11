package Day_11;
import java.util.*;
class z
{
    public void sum (int a)
    {
        int fact =1;
        for(int i =1;i<=a;i++)
        {
              fact = fact *i;
        }

        System.out.println("FACTORIAL :"+fact);
    }

    public static void main(String args[])
    {
        z obj=new z();
        obj.sum(5);

    }
}