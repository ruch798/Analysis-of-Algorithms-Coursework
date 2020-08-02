import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
int n;
 System.out.println("Enter no. of elements");
n=Integer.parseInt(br.readLine());
 int w[] = new int[100];
int ob[] = new int[100];
int r = 0;
int m;
System.out.println("Enter weights of elements");
for(int i=1;i<=n;i++)
{
w[i] = Integer.parseInt(br.readLine());
r = r + w[i];
}

System.out.println("Enter sum of subset to be found");
m = Integer.parseInt(br.readLine());

check(ob,w,0,1,r,m,n);
}
public static void check(int ob[],int w[],int s,int k,int r,int m,int n)
{

if(s+w[k] ==m)
{
  ob[k] = 1;
  for(int i=1;i<=n;i++)
  {
    System.out.print(ob[i] + "  ");
      }
  System.out.println();
}
else if(s+w[k]+w[k+1]<=m)
{
  ob[k] = 1;
  check(ob,w,s+w[k],k+1,r-w[k],m,n);
}
if(s+r-w[k]>=m && s+w[k]<=m)
{
  ob[k] = 0;
  check(ob,w,s,k+1,r-w[k],m,n);
}
 }

 
}





