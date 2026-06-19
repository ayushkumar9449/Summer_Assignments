import java.util.*;
class xz
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROWS AND COLUMS OF FIRSST MATRIX");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        
        int [][] A = new int[r1][c1];
        
        int [][]C = new int[c1][r1];
        int i,j;
        System.out.println("ENTER  MATRIX ELEMENT :");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                C[j][i]=A[i][j];
            }
        }
       
        
         System.out.println("TRANSPOSE OF MATRIX  :");
        for(i=0;i<c1;i++)
        {
            for(j=0;j<r1;j++)
            {
                System.out.println(C[i][j]);
            }
        }
    }

}

