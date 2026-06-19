import java.util.*;
class de
{
    public static void main(String args [])
    {
         Scanner sc = new Scanner (System.in);
        System.out.println("ENTER FIRST ARRAY LENGTH :");
        int n = sc .nextInt();
        System.out.println("ENTER SECOND ARRAY LENGTH :");
        int m=sc.nextInt();
        int [] arr1=new int [n];
        int [] arr2 = new int [m];
        boolean exist;
        int i ;

        for(i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }

        for(i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr[j]);
                    exist = true;
                }
                
            }
        }
    }


    
}