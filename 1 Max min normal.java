import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    int n,i,max,min;
   

    System.out.println("Enter no. of elements");
    n=Integer.parseInt(br.readLine());

   int a[]= new int[n];
    System.out.println("Enter array elements");
    for(i=0;i<n;i++)
    {
      a[i] = Integer.parseInt(br.readLine());
    }
    
    max=a[0];
    min=a[0];

     for(i=0;i<n;i++)
    {
      if(a[i]>max)
      max=a[i];
      if(a[i]<min)
      min=a[i];
    }

    System.out.println("Max"+max);
    System.out.println("Min"+min);
  }
}

