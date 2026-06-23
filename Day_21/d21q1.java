import java.util.*;
class cd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String x = "";
        System.out.println("ENETR ANY SENTENCE :");
        x= sc.nextLine();
        int c=0;

        for(char ch : x.toCharArray())
        {
            c++;
        }

        System.out.println("STRING LENGTH :"+c);
    }
}