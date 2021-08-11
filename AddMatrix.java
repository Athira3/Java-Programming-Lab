import java.util.*;
class AddMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;

        System.out.println("Enter the number of rows of matrices: ");
        m=sc.nextInt();
		System.out.println("Enter the number of columns of matrices: ");
        n=sc.nextInt();

        int[][] m1=new int[m][n];
        int[][] m2=new int[m][n];
        int[][] sum=new int[m][n];

        System.out.println("Enter the elements of 1st matrix : ");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                m1[i][j]=sc.nextInt();

        System.out.println("Enter the elements of 2nd matrix : ");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                m2[i][j]=sc.nextInt();

        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                sum[i][j]=m1[i][j]+m2[i][j];
        

        System.out.println("Elements of 1st Matrix : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(m1[i][j]+"\t");
            System.out.println();
        }

        System.out.println("Elements of 2nd Matrix : ");
        for(i=0;i<m;i++)
        {
			
            for(j=0;j<n;j++)
                System.out.print(m2[i][j]+"\t");
            System.out.println();
        }

        System.out.println("Sum of Two Matrices : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(sum[i][j]+"\t");
            System.out.println();
        }

    }
}