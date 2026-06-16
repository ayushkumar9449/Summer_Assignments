import java.util.*;
class cx
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int n = sc.nextInt();
        int [] nums = new int[n];
        int first = 0;
        int last =nums.length-1;

                System.out.println("ARRAY ELEMENTS :");


        for(int i=0;i<nums.length;i++)
    {
            nums[i]=sc.nextInt();
    }

    while(first<last)
    {
        int temp=nums[last];
        nums[last]=nums[first];
        nums[first]=temp;
        first++;
        last--;
    }

    System.out.println("REVERSED ARRAY :");
    for(int j=0;j<nums.length;j++)
    {
        System.out.println(nums[j]);
    }

    }
}