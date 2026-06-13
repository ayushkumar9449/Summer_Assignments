import java.util.*;
class ARMSt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int n = sc .nextInt();
        int i;
        int sum=0;

        int [] arr = new int[n];

        System.out.println("ENTER ARRAY ELEMENTS :");
        for( i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum +arr[i];

        }

        int avg=(sum/arr.length);

        System.out.println("SUM :"+sum);
        System.out.println("AVERAGE :"+avg);


        
    }
}