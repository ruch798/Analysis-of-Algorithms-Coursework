import java.io.*;
import java.util.*;

class Main
{
   public static void main(String args[])throws IOException
 {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   Random r = new Random();
   int i,j,k,n,index,min;
    
   System.out.println("Enter no. of elements");
   n=Integer.parseInt(br.readLine());

  int a[]= new int[n];
  int aorig[] = new int[n];

  
   for(k=0;k<n;k++)
   {
     a[k] = r.nextInt(100);
   }
   for(k=0;k<n;k++)
   {
     aorig[k] = a[k];
   }

   for(i=0;i<n-1;i++)
   {
     index = i;
     for(j=i+1;j<n;j++)
     {
       if(a[j]<a[index])
       {
         index = j;
       }
     }
     min = a[index];
     a[index]=a[i];
     a[i]=min;
    
   }
   System.out.println("Unsorted array");
    for(k=0;k<n;k++)
   {
     System.out.print(aorig[k] + " ");
   }
   System.out.println();
    System.out.println("Sorted array");
    for(k=0;k<n;k++)
   {
     System.out.print(a[k] + " ");
   }
 }
}
  
  


