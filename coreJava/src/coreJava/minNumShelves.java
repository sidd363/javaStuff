package coreJava;

public class minNumShelves {
	
	public int minHeightShelves(int[][] books, int shelf_width) {
        int[] dp = new int[books.length + 1];
        
        dp[0] = 0;
        
        for (int i = 1; i <= books.length; ++i) {
            int width = books[i-1][0];
            int height = books[i-1][1];
            dp[i] = dp[i-1] + height;
            for (int j = i - 1; j > 0 && width + books[j-1][0] <= shelf_width; --j) {
                height = Math.max(height, books[j-1][1]);
                width += books[j-1][0];
                dp[i] = Math.min(dp[i], dp[j-1] + height);
            }
        }
        return dp[books.length];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] b = {{1,1},
				{2,3},{2,3}
				,{1,1},
				{1,1},
				{1,1},{
					2,1}};
		minNumShelves o = new minNumShelves();
		System.out.println(o.minHeightShelves(b, 4));
		
		
	}

}
