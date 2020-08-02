import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[])throws IOException
{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 String fin = new String();
 StringBuffer sb = new StringBuffer();
 int i,j;
 int a[][] = new int[100][100];
 char c1[] = new char[100];
 char c2[] = new char[100];

 int z;
 String s1,s2;
 System.out.println("Enter string 1");
 s1=br.readLine();
 System.out.println("Enter string 2");
 s2=br.readLine();
 c1 = s1.toCharArray();
 c2 = s2.toCharArray();

 for(i=1;i<=s1.length();i++)
 {
   for(j=1;j<=s2.length();j++)
   {
     if(c1[i-1]==c2[j-1])
     {
       a[i][j] = 1 + a[i-1][j-1];
     }
     else if(c1[i-1] != c2[j-1])
     {
       a[i][j] = Math.max(a[i][j-1],a[i-1][j]);
     }
   }
 } 
  for (i=0;i<=s1.length();i++)
   {
     for (j=0;j<=s2.length();j++)
     {
       System.out.print(a[i][j] + "\t");
     }
     System.out.println();
   }
  
   z=a[s1.length()][s2.length()];
   i=s1.length();
   j=s2.length();

   while(z!=0)
   {
     if(a[i][j] == a[i][j-1] && a[i][j] == a[i-1][j]) //both left and upper element
     {
       z = a[i-1][j];
       i--;
     }
     else if(a[i][j] == a[i-1][j]) //upper element
     {
       z = a[i-1][j];
       i--;
     }
      else if(a[i][j] == a[i][j-1]) //left element
     {
       z = a[i][j-1];
       j--;
     }
     else if(a[i][j] != a[i][j-1] && a[i][j] != a[i-1][j]) //arrow
     {
       fin = fin.concat(Character.toString(c1[i-1]));
       z=a[i-1][j-1];
       i--;
       j--;
     }
   }
   sb =sb.append(fin);
   sb = sb.reverse();
    System.out.println ("The longest sub sequence is " + sb + " of length " + sb.length());


}
}




