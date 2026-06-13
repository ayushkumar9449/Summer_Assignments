import java.util.*;
class ARMS
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int n = sc .nextInt();
        int i;

        int [] arr = new int[n];

        System.out.println("ENTER ARRAY ELEMENTS :");
        for( i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("DISPLAY OF ARRAY ELEMENTS :");
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}