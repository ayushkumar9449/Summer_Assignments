import java.util.*;
class xyz
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        {
            int[] arr= new int[20];
            int x;
            int index=0;
            int count =0;

            System.out.println("ENTER ANY NUMBER :");
            x=sc.nextInt();

            while(x>0)
            {
                arr[index++]= x%2;
                x=x/2;
            }


            for(int i = index -1;i>=0;i--)
            {
                if(arr[i]==1)
                {
                    count++;
                }

            }
            

            System.out.println("NO OF BITS ARE :"+count);


        }
    }
}

    