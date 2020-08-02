import java.io.*;
import java.util.*;

class Main
{
   public static void main(String args[])throws IOException
 {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   Random r = new Random();
   int i,j,k,key,n;
    
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

   for(i=1;i<n;i++)
   {
     key = a[i];
     j = i-1;

     while(j>=0 && a[j]>key)
      {
        a[j+1] = a[j];
        j=j-1;;
      }
      a[j+1] = key;
    
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
  
  


