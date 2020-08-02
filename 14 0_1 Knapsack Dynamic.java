import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[])throws IOException
{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 int n,maxw,i,j,k,w,max_profit;
  System.out.println("Enter no. of elements");
 n=Integer.parseInt(br.readLine());
 int ob[] = new int[100];
 int p[] = new int[100];
 int wg[] = new int[100];

 System.out.println("Enter weight of knapsack");
 maxw=Integer.parseInt(br.readLine());
System.out.println("Enter profits");
for(i=1;i<=n;i++)
{
 p[i] = Integer.parseInt(br.readLine());
}
System.out.println("Enter weights");
for(i=1;i<=n;i++)
{
 wg[i] = Integer.parseInt(br.readLine());
}
  int table[][] = new int[n+1][maxw+1];
for(i=1;i<=n;i++)
{
  for(w=1;w<=maxw;w++)
  {
    if(wg[i]<=w)
    {
     table[i][w]=Math.max(table[i-1][w],p[i]+table[i-1][w-wg[i]]);
    }
    else
        table[i][w]=table[i-1][w];
  }
}
max_profit = table[n][maxw];
i=n;
j=maxw;

System.out.println("Max profit : "+max_profit);
while(max_profit!=0)
{
 if(table[i-1][j] == max_profit )
 {
   ob[i] = 0;
   i--;
 }
 else
 {
   max_profit = max_profit - p[i];
   ob[i]=1;
   i--;
   for(k=0;k<=maxw;k++)
   {
     if(table[i][k] == max_profit)
     {
       j=k;
     }
    }
 }
}
 System.out.println("Weights to be included");
 for(k=1;k<=n;k++)
 {
   if(ob[k] == 1)
   {
     System.out.println(wg[k]);
   }
 }

 System.out.println("Printing table");
for(i=0;i<=n;i++)
{
  for(w=0;w<=maxw;w++)
  {
    System.out.print(table[i][w]);
  }
  System.out.println();
}

}
}







