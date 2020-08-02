import java.io.*;
class Main
{
   public static void main(String args[])throws IOException
 {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   int k,n,num,flag;
    
   System.out.println("Enter no. of elements");
   n=Integer.parseInt(br.readLine());

  int a[]= new int[n];

   System.out.println("Enter array elements");
   for(k=0;k<n;k++)
   {
     a[k] = Integer.parseInt(br.readLine());
   }

   System.out.println("Enter the value to be searched");
   num=Integer.parseInt(br.readLine());

   flag = BinarySearch(0,n-1,num,a);
   if(flag == 1)
   {
     System.out.println("Value found");
   }
  else
   {
     System.out.println("Value not found");
   }
   }

  public static int BinarySearch(int start,int end,int num,int a[])
   {
     int mid;
    
     if(start==end && num!=a[start])
     {
       return 0;
     }
     while(start<=end)
     {
       mid = (start+end)/2;
     if(num==a[mid])
     {
       return 1;
     }
     else if(num<a[mid])
     {
       end = mid-1;
      
     }
     else
       start = mid+1;
     }
    return 99;
   }
 }
  
  


