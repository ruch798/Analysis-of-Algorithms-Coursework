import java.io.*;
import java.util.*;

class Main
{
  public static void main(String args[])throws IOException
{
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  Random r = new Random();
  int i,j,k,n;
  
  System.out.println("Enter no. of elements");
  n=Integer.parseInt(br.readLine());

 int a[]= new int[n+1];
 int aorig[] = new int[n+1];

   for(k=0;k<n;k++)
  {
    a[k] = r.nextInt(100);
  }
 
  for(k=0;k<n;k++)
  {
    aorig[k] = a[k];
  }
 
 
  System.out.println("Unsorted array");
   for(k=0;k<n;k++)
  {
    System.out.print(aorig[k] + " ");
  }
  quickSort(a,0,n-1);
 
   System.out.println("Sorted array");
   for(k=0;k<n;k++)
  {
    System.out.print(a[k] + " ");
  }
}

  public static int partition(int a[],int l,int h)
  {
    int i=l;
    int j=h;
    int pivot = a[l];
    int temp,temp2;
    while(i<j)
    {
      while(a[i]<pivot)
      {
        i++;
      }
      while(a[j]>pivot)
      {
        j--;
      }
      if(i<j)
      {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }
     
        temp2 = pivot;
        pivot = a[j];
        a[j] = pivot;
         return j;
    }
   
 
 
 public static void quickSort(int a[],int l,int h)
 {
  
   if(l<h)
   {
       int j = partition(a,l,h);
       quickSort(a,l,j-1);
       quickSort(a,j+1,h);
   }
  }
}

