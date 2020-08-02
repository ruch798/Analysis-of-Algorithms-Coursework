import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])throws IOException
{
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  int n,i,j,k,t;
   System.out.println("Enter no. of vertices");
  n=Integer.parseInt(br.readLine());
 
  int a[][] = new int[n+1][n+1];
  int temp[][] = new int[n+1][n+1];

  System.out.println("Enter distance of diff. vertices and 9999 if doesnt exist");
 for(i=1;i<=n;i++)
 {
   for(j=1;j<=n;j++)
   {
     a[i][j] = Integer.parseInt(br.readLine());
   }
 }
 for(t=1;t<=n;t++)
 {
   for(i=1;i<=n;i++)
   {
     for(j=1;j<=n;j++)
     {
       if(i==j)
       {
         temp[i][j]=0;
         continue;
       }
       else
       {
         temp[i][j] = Math.min(a[i][j],a[i][t]+a[t][j]);
       }
     }
   }
 
 System.out.println("Matrix after "+ (t-1) +" iterations");
 for(i=1;i<=n;i++)
 {
   for(j=1;j<=n;j++)
   {
     a[i][j]=temp[i][j];
     System.out.print(a[i][j] + "  ");
   }
    System.out.println();
 }
 }
}
}

