import java.util.*;
class ARMSt
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
        int max=arr[0];
        int min=arr[0];

        for(i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }


        System.out.println("MAXIMUN :"+max);
        System.out.println("MINIMUM :"+min);


        
    }
}