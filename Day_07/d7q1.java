import java.util.*;
class za
{
    int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return (n*fact(n-1));
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ANY NUMBER :");
        int num = sc.nextInt();

        za obj = new za();
        int w =   obj.fact(num);

        System.out.println("FACTORIAL :"+w);
    }
}
   