import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])throws IOException
{
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  int n,i,j,w,index;
  double temp,maxw;
   System.out.println("Enter no. of elements");
  n=Integer.parseInt(br.readLine());
 
  double p[]=new double[n];
  double wg[]=new double[n];
  double pw[]=new double[n];

  System.out.println("Enter weight of knapsack");
  maxw=Double.parseDouble(br.readLine());

 System.out.println("Enter profits");
  for(i=0;i<n;i++)
 {
  p[i] = Double.parseDouble(br.readLine());
 }
 System.out.println("Enter weights");
 for(i=0;i<n;i++)
 {
  wg[i] = Double.parseDouble(br.readLine());
 }
 for(i=0;i<n;i++)
 {
  pw[i]=p[i]/wg[i];
 }
  for(i=0;i<n-1;i++)
   {
     index = i;
     for(j=i+1;j<n;j++)
     {
       if(pw[j]>pw[index])
       {
         index = j;
       }
     }
     temp = pw[index];
     pw[index]=pw[i];
     pw[i]=temp;
     temp = wg[index];
     wg[index]=wg[i];
     wg[i]=temp;
   }
   for(i=0;i<n;i++)
 {
  System.out.println(pw[i]);
 }
 double x[]=new double[n];
  for(i=0;i<n;i++)
 {
   if(wg[i]>maxw)
   break;
   else
   {
     x[i]=1;
     maxw=maxw-wg[i];
   }
 }
   if(i<n)
   {
     x[i]=maxw/wg[i];
   }
  
    System.out.println("Objects");
    double profit=0.0;
   for(i=0;i<n;i++)
   {
      if(x[i]!=0)  
      {
        System.out.println(x[i]);
        profit = profit + pw[i]*wg[i]*x[i];
      }
   }
   System.out.println("Profit" +profit);

 }
}

