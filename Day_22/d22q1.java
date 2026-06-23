import java.util.*;
class z
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        String a ="";
        System.out.println("ENTER ANY THE STRING :");
        a = sc.next();
        String b = "";
        char ch;

        for(int i =a.length()-1 ;i>=0;i--)
        {
            ch=a.charAt(i);
            b=b+ch;
        }

        if(a.equalsIgnoreCase(b))
        {
            System.out.println("PALINDROME STRING :");
        }
        else
        {
            System.out.println("NOT A APALINDROME STRING :");

        }

    }    

        
}


