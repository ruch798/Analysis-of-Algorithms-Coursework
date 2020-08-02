import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
int n,i,j,temp1,temp2;
 System.out.println("Enter no. of jobs");
n=Integer.parseInt(br.readLine());
 int a[][] = new int[2][n];
 int job[] = new int[n];
System.out.println("Enter profits of jobs");
for( i=0;i<n;i++)
{
a[0][i] = Integer.parseInt(br.readLine());
}
System.out.println("Enter deadlines of jobs");
for( i=0;i<n;i++)
{
a[1][i] = Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
   {
         
     for(j=i+1;j<n;j++)
     {
       if(a[0][j]>a[0][i])
       {
         temp1 = a[0][i];
         a[0][i]=a[0][j];
         a[0][j]=temp1;

         temp2 = a[1][i];
         a[1][i]=a[1][j];
         a[1][j]=temp2;
       }
     }
    
   }
 for(i=0;i<n;i++)
 {
   for(j=(a[1][i]-1);j>=0;j--)
   {
     if(job[j]==0)
     {
       job[j] = a[0][i];
       break;
     }
   }
 }
 int profit = 0;
 for(i=0;i<n;i++)
 {
  
   profit = profit + job[i];
 }
 System.out.println("Profit " + profit);
}
}


