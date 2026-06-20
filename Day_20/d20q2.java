import java.util.*;
class ayusH
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER ROWS AND COLUMN: ");
        int r = sc.nextInt();
        int c=sc.nextInt();
        int i,j;
        int A[][] = new int[r][c]; 
        
        System.out.println("ENTER MATRIX ELEMENT");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                 if(A[i][j]==A[j][i])
                 {
                     count++;
            }
        }
    }
        if(count==(r*c))
        {
            System.out.println("SYMETRIC MATRIX");
        }
        else
        {
            System.out.println("NOT A SYMETRIC MATRIX");
        }
    
    
}
}