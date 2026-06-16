import java.util.*;
class cxa
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE :");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("ARRAY MEMEBERS: ");
        for(int a=0;a<n-1;a++)
        {
            arr[a]=sc.nextInt();    
        }

        for(int i =0;i<n-1;i++)
        {
            for(int j =0;j<n-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }


        }

        for(int c=0;c<n-1;c++)
        {
            System.out.println(arr[c]);
        }
    }
}