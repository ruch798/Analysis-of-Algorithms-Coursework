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
 
  System.out.println("Unsorted array");
   for(k=0;k<n;k++)
  {
    System.out.print(aorig[k] + " ");
  }
  sort(a,0,n-1);
 
   System.out.println("Sorted array");
   for(k=0;k<n;k++)
  {
    System.out.print(a[k] + " ");
  }
}

  public static void merge(int a[],int p,int q,int r)
  {
    int n1,n2,i,j,k;
    n1 = q-p+1;
    n2 = r-q;

    int left[] = new int[n1];
    int right[] = new int[n2];

    for(i=0;i<n1;i++)
   {
     left[i] = a[p+i];
   }
   for(j=0;j<n2;j++)
   {
     right[j] = a[q+j+1];
   }
   i=0;j=0;k=p;
   while(i<n1 && j<n2)
   {
     if(left[i]<=right[j])
     {
       a[k]= left[i];
       i++;
       k++;
     }
     else
     {
       a[k]= right[j];
       j++;
       k++;
     }
    
   }
   for(;i<n1;i++)
   {
     a[k]= left[i];
      k++;
   }
   for(;j<n2;j++)
   {
       a[k]= right[j];
       k++;
   }

  }
 
 public static void sort(int a[],int p,int r)
 {
   if(p<r)
   {
       int q = (p+r)/2;
       sort(a,p,q);
       sort(a,q+1,r);
       merge(a,p,q,r);
   }
  }
}

