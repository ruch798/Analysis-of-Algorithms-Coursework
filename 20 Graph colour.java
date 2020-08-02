import java.util.*;
class Main
{
 static int graph [][]= new int [100][100];
 static int x[]= new int [100];
static int col,n;                              *global,local ka confusion*

 public static void mcolour (int k)
 {
   int s;
   while (true)
   {
     check (k); //function to check if a particular vertex can be assigned a colour
     if (x[k]==0)  //if vertex wasn't assigned a colour
     {
       break;
     }
     if (k==n)   //print if all vertices have been assigned a colour
     {
         for (s=1;s<=n;s++)
         {
           System.out.print (x[s]);
         }
         System.out.println ();
     }
     else
     {
       mcolour (k+1); //call function for next vertex
     }

   }
 }

 public static int check (int k)
 {
   int j;
   while (true)
   {
     x[k] = (x[k]+1)%(col+1); //checks for every available colour

     if (x[k]==0) //if no colour can be assigned to the vertex
     {
       return 0;
     }

     for (j=1;j<=n;j++)
     {
       if (graph[k][j] == 1 && x[j]==x[k])  //backtracking condition
       {
         break;
       }
     }
     if (j==n+1)  //if the vertex is assigned a colour since adjacent doesn't possess the same colours
     {
       return 0;
     }
   }
 }
 public static void main (String args[])
 {
   Scanner sc = new Scanner (System.in);
   int i,e,a,b;
   System.out.println ("Enter the no of vertices");
   n = sc.nextInt();
   System.out.println ("Enter the no of edges");
   e = sc.nextInt();
   for (i=1;i<=e;i++)
   {
     System.out.println ("Enter the vertices which have the edge " + i);
     a= sc.nextInt();
     b= sc.nextInt();
     graph [a][b]= 1;
     graph [b][a]= 1;
   }
   for (i=1;i<=n;i++)
   {
     x[i]= 0;
   }
   System.out.println ("Enter the number of colours");
   col= sc.nextInt();
   System.out.println ("The possibilities are:");
   mcolour (1);  //function to print the possibilities

 }
}


