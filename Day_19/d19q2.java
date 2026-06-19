import java.util.*;
class xz
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROWS AND COLUMS OF FIRSST MATRIX");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("ENTER ROWS AND COLUMS OF SECOND MATRIX");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][] A = new int[r1][c1];
        int [][]B = new int [r2][c2];
        int [][]C = new int[r1][c1];
        int i,j;
        System.out.println("ENTER FIRST MATRIX ELEMENT :");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
         System.out.println("ENTER SECOND MATRIX ELEMENT :");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                B[i][j]=sc.nextInt();
                C[i][j]=A[i][j]-B[i][j];
            }
        }
         System.out.println("SUBTRACTION OF MATRIX  :");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.println(C[i][j]);
            }
        }
        

    }
}