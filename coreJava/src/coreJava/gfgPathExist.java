package coreJava;

import java.util.*;

public class gfgPathExist {

	
	//4
	//3 0 0 0 0 3 3 0 0 1 0 3 0 2 3 3 
	//3
	//0 3 2 3 0 0 1 0 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-->0) {
			 int r = sc.nextInt();
			 
			 int n = r*r;
			 
			 int[][] grid = new int[r][r];
			 int[] target = new int[2];
			 Queue<int[]> q = new LinkedList<>();
			 boolean[][] visited = new boolean[r][r];
			 for(int i =0;i<r;i++) {
				 for(int j =0;j<r;j++) {
					 
					 int bc = sc.nextInt();
					 grid[i][j]= bc;
					 
					 if(bc==1) {
						 //add source;
						 q.add(new int[] {i,j});
					 }else if(bc==2) {
						 target[0]=i;
						 target[1]=j;
					 }
					 
				 }
			 }
			 int[] dirs = {-1,0,0,-1,0,1,1,0};
			 
			 while(!q.isEmpty()) {
				 
			 }
		 }
	}

}
