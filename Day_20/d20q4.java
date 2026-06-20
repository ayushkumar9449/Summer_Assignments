import java.util.*;
class daa
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ROWS AND COLUMNS :");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int i,j;
        

        int A[][] = new int [r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }

        }

        for(i=0;i<r;i++)
        {
            int C=0;
            for(j=0;j<c;j++)
            {
              C=C+A[i][j];
            }
            System.out.println("COLUMN SUM :"+C);
        }




    }
}