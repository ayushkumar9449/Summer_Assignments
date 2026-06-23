import java.util.*;
class xx
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String a="";
        String b="";
        System.out.println("ENTER ANY SENTENCE :");
        a=sc.nextLine();
        char ch;


        for(int i =a.length()-1;i>=0;i--)
        {
            ch=a.charAt(i);
            b=b+ch;

        }

        System.out.println("SENTENCE : "+b);
    }
}