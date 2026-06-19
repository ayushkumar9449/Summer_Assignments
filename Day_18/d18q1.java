import java.util.*;
class cd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ARRAY SIZE :");
        int n= sc.nextInt();
        int [] arr = new int[n];
        int i,j;

        System.out.println("ENTER ARRAY ELEMENTS :");
        for( i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(i=0;i<arr.length;i++)
        {
             for(j=0;j<arr.length-i-1;j++)
             {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
             }
        }
        
        System.out.println("SORTED ARRAY THROUGH BUBBLE SORT  :");
        for(j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }


    }
}