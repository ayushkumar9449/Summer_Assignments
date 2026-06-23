import java.util.*;
class z
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in );
        String a="";
        System.out.println("ENTER ANY SENTENCE  :");
        a = sc.nextLine ();
        a=a.toUpperCase();
        int v=0;
        int c=0;
        char ch;

        for(int i = 0;i<a.length();i++)
        {
             ch = a.charAt(i);
             if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
             {
                v++;
             }
             else
             {
                c++;
             }
        }

        System.out.println("VOWELS :"+v);
        System.out.println("CONSONENT  :"+c);



    } 
}