import java.util.Scanner;  public class kruskal{ 	 	public static void main(String[] args){ 		 		Scanner scan = new Scanner(System.in); 		int[][] matrix = new int[5][5]; 		int[] parent = new int[5]; 		int min; 		int u = 0;  		int v = 0; 		int noOfEdges = 1; 		int total = 0; 		 		for(int i = 0; i < 5; i++)
{ 			 			parent[i] = 0; 			 			for(int j = 0; j < 5; j++)
      { 				 		  matrix[i][j] = scan.nextInt(); 			if(matrix[i][j]==0)
{ 	   matrix[i][j] = 999; 	} 				 }
            } 		 		while(noOfEdges < 5)
            { 			 			min = 999; 			 			for(int i = 0; i < 5; i++)
{ 				 	    	for(int j = 0; j < 5; j++)
      { 					 			if(matrix[i][j] < min)
            { 				min = matrix[i][j]; 				u = i; 				v = j; 						 			} 		}       } 	while(parent[u]!=0)
{ 	u = parent[u]; 	} 	while(parent[v]!=0)
{ 	v = parent[v]; 	} 			 	if(v!=u)
{ 		noOfEdges++; 	      System.out.println("Edge Found: " + u + "->" + v+" Min : " + min); 		total+=min; 		parent[v] = u; 	} 		matrix[u][v] = 999; 		matrix[v][u] = 999; 			
    }
System.out.println("The weight of the minimum spanning tree is "+total); 		 	} 	 }

