import java.util.*;
class cx
{
    public static void main(String args[])

    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER FIRST ARRAY SIZE :");
        int n=sc.nextInt();
        System.out.println("ENTER SECOND ARRAY SIZE :");
        int m=sc.nextInt();
        int i;
        int []arr1 = new int[n];
        int []arr2 = new int[m];
        int []arr3 = new int[m+n];
        System.out.println("ENTER FIRST ARRAY MEMBERS :");
        for(i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("ENTER SECOND ARRAY MEMBERS :");
        for(i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
        for(i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
        }

         for(i=0;i<arr2.length;i++)
        {
            arr3[arr1.length+i]=arr2[i];
        }

         for(i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }









    }
}