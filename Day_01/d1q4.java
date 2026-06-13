import java.util.*;
class a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ANY NUMBER");
        int n = sc.nextInt();
       
        int d=0;
        while(n>0)
        {
            d++;
            n=n/10;
        }
        System.out.println("NUMBER OF DIGIT :" +d);
    }

        
}