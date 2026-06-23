import java.util.*;
class fd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String x = "";
        System.out.println("ENETER ANY STRING SENTENCE :");
        x = sc.nextLine();
        String w = "";
        char ch;


        for(int i =0;i<x.length();i++)
        {
            ch = x.charAt(i);

            if(ch == ' ')
            {
                continue;
            }
            w=w+ch;
        }

        System.out.println("SENTENCE WITHOUT SPACES ARE :"+w);

    }
}