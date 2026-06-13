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
        int even=0;
        int odd=0;

        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            
        }


        System.out.println("EVEN NUMBER :"+even);
        System.out.println("ODD NUMBER :"+odd);


        
    }
}