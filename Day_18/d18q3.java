import java.util.*;
class xz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ARRAY SIZE :");
        int n = sc.nextInt();   
        int [] arr= new int[n];
        System.out.println("ENTER ARRAY ELEMENTS :");
        for(int i =0;i<arr.length;i++)
        {
            arr [i] = sc.nextInt();
        } 

        int ub=0;
        int lb = arr.length-1;
        int mid;
        int count =0;

        while(ub<=lb)
        {
            mid=(ub+lb)/2;

            if(arr[mid]==target)
            {
                System.out.println("FOUND :");
                 count =1;
            }
            if(arr[mid]<target)
            {
                ub=mid+1;
            }
            else
            {
               lb=mid-1;
            }

        }

        if(count != 1)
        {
            System.out.println("NOT FOUND :");
        }
    }
}