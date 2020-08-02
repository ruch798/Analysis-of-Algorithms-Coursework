import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int n,i,j,k,max,min;
   
    System.out.println("Enter no. of elements");
    n=Integer.parseInt(br.readLine());

   int a[]= new int[n];
   int r[]= new int[2];
    System.out.println("Enter array elements");
    for(k=0;k<n;k++)
    {
      a[k] = Integer.parseInt(br.readLine());
    }
 
    MaxMin(0,n-1,r,a);
    System.out.println("Max"+r[0]);
    System.out.println("Min"+r[1]);
       
  }
    
    public static void MaxMin(int i,int j,int r[],int a[]) 
    {
     int r1[] = new int[2];
     int mid;

      if(i==j)
      {
        r[0]=a[i];
        r[1]=a[i];
          }

      else if(i==j-1)
      {
        if(a[i]<a[j])
        {
          r[0]=a[j];
          r[1]=a[i];
        }
        else
        {
          r[0]=a[i];
          r[1]=a[j];
        }
      }

      else
      {
        mid = (i+j)/2;
        MaxMin(i,mid,r,a);
        MaxMin(mid+1,j,r1,a);
        
        if (r[0]<r1[0])
        {
          r[0]=r1[0];
          }
        if (r[1]>r1[1])
        {
           r[1]=r1[1];
          }
      }
    }
}
    
  


