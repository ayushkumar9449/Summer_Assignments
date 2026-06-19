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
        int s1=0;
        int s2=0;
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
                if((i==j))
                {
                  s1=s1+A[i][j];
                }

                if((i+j)==r1)
                {
                    s2=s2+A[i][j];
                }
            }
        }
       
        
        System.out.println("SUM OF  DIAGONAL MATRIX (RIGHT):");
        System.out.print(s1);
        System.out.println("SUM OF  DIAGONAL MATRIX(LEFT): ");
        System.out.println(s2);




        
    }
}