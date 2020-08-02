import java.io.*;
import java.util.*;
class Main
{
 static int n;
 public static void main(String args[])throws IOException
{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);

 System.out.println("Enter n");
 n=Integer.parseInt(br.readLine());
 int m[][] = new int[n][n];
  queen(m,0,n);

}
public static void queen(int m[][], int start, int count)
{
 if(count==0)
 return ;
  for(int i=0;i<n;i++)
 {
   boolean flag = check(m,start,i);
   if(flag == true)
   {
     m[start][i] = 1;
     queen(m,start+1,count-1);
     if(count==1)
     {
       print(m);
     }
     for(int j=0;j<n;j++)
     {
       m[start][j] = 0;
     }
   }

 }
  
}
public static boolean check(int m[][], int row, int column)
{
 for(int i=0;i<n;i++)
 {
   for(int j=0;j<n;j++)
   {
     if(m[i][j] == 1)
     {
       if(row==i)
       return false;
       else if(column==j)
       return false;
       else if(Math.abs(row-i) == Math.abs(column-j))
       return false;
     }
   }
  }
 return true;
}

public static void print(int m[][])
{
 for(int k=0;k<n;k++)
 {
   for(int i=0;i<n;i++)
  
     System.out.print(m[k][i]+" ");
     System.out.println();
  
 }
   System.out.println();
}
}





