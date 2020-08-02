import java.util.*;
import java.io.*;
class Main{
static int n,u;
static float cost[][]=new float[100][100];
static float dist[]=new float[100];
static int v;

public static void shortestpath(int v)
{
   int s[]=new int[100];
  float min;
  for(int i=1;i<=n;i++)
  {
    s[i]=0;
    dist[i]=cost[v][i];
  }
  s[v]=1;
  dist[v]=0;
  for(int num=2;num<n;num++)
  {
    min=9999;
    for(int i=1;i<=n;i++)
    {
       if((s[i]!=1)&& (min>dist[i]) && (dist[i]!=-1) )
       {
         u=i;
         min=dist[i];
       }
    }
    s[u]=1;
    for(int w=1;w<=n;w++)
    {
         if((s[w]==0)&& (dist[w]>dist[u]+cost[u][w]))
         dist[w]=dist[u]+cost[u][w];
    }
  }
   }
public static void main(String args[])
{
  int a,b;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the no.of vertices");
  n=sc.nextInt();
  for(int i=1; i<=n;i++)
  {
    for(int j=1;j<=n;j++)
    {
    cost[i][j]=9999;
    cost[i][i]=0;
  }
  }
  System.out.println("enter the total no.of edges");
  int e=sc.nextInt();
  for(int i=1;i<=e;i++)
  {
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("enter cost");
    cost[a][b]=sc.nextInt();
  }
  System.out.println("enter the source vertex");
  v=sc.nextInt();
shortestpath(v) ;
for(int i=1;i<=n;i++)
System.out.println("the length shortest is from" + v +"to" + i + "is" + dist[i]);  
}
}



