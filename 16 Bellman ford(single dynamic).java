import java.io.*;
import java.util.*;

class Main
{
  public static void main(String args[])throws IOException
{
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
   int i,j,k,n;
  
  System.out.println("Enter no. of vertices");
  n=Integer.parseInt(br.readLine());

 int adj[][]= new int[100][100];
 int bell[][]= new int[100][100];
 int temp,small;

   for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      adj[i][j] = Integer.parseInt(br.readLine());
    }
  }
  for(j=2;j<=n;j++)
  {
    bell[1][j] = adj[1][j];
   
  }
  for(i=2;i<=n;i++)
  {
    for(j=2;j<=n;j++)
    {
      small = 1000;
      for(k=2;k<=n;k++)
      {
         temp = bell[i-1][k] + adj[k][j];

         if(temp<small)
         {
           small = temp;
         }
      }
      bell[i][j] = Math.min(bell[i-1][j],small);
    }
   
  }
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      System.out.print(bell[i][j] + " ");
    }
    System.out.println();
  }

}
}

 

