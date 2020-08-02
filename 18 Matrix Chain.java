import java.io.*;
class Main
{
  public static void main(String args[])throws IOException
{
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  int k,i,d,j,n,cost;
   System.out.println("Enter no. of elements");
  n=Integer.parseInt(br.readLine());

 int p[] = new int[n];
 int m[][] = new int[n][n];
 int s[][] = new int[n][n];
 System.out.println("Enter profit values");
 for(i=0;i<n;i++)
 {
  p[i] = Integer.parseInt(br.readLine());
 }
 for(i=0;i<n;i++)
 {
   for(j=0;j<n;j++)
   {
     s[i][j] = 0;
     m[i][j] = 0;
   }
 }

for ( d=1; d<n-1; d++)
   {
       for (i=1; i<n-d; i++)
       {
           j = i+d;
           m[i][j] = 9999; 
           for ( k=i; k<j; k++)
           {
               cost = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
               if (cost < m[i][j])
               {
                   m[i][j] = cost;
 	               s[i][j] =k;  
               }
           }
       }
   }
  System.out.println("M matrix");
   for(i=0;i<n;i++)
 {
   for(j=0;j<n;j++)
   {
      System.out.print(m[i][j] + " ");
   }
   System.out.println();
 }
  System.out.println("S matrix");
   for(i=0;i<n;i++)
 {
   for(j=0;j<n;j++)
   {
      System.out.print(s[i][j] + " ");
   }
   System.out.println();
 }
}
}



