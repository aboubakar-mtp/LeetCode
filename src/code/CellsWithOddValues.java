package code;

public class CellsWithOddValues {
	
	 public int oddCells(int n, int m, int[][] indices) {
		 int count = 0;
		 int[][] mat = new int[n][m];
		 
		 for(int i=0; i< indices.length; i++) {
			 for(int c=0; c<m; c++) {
				 mat[indices[i][0]][c] += 1;
				 if(mat[indices[i][0]][c] % 2 == 0) {
					 count--;
				 }
				 else {
					 count++;
				 }
			 }
			 for(int r=0; r<n; r++) {
				 mat[r][indices[i][1]] += 1;
				 
				 if(mat[r][indices[i][1]] %2 == 0) {
					 count--;
				 }
				 else {
					 count++;
				 }
			 }
		 }
		 
		 return count;    
	 }
	 
	 
	 public int oddCells2(int n, int m, int[][] indices) {
		 int[] rowInc = new int[n]; //keep counts of total increment for each row
		 int[] colInc = new int[m]; // similar for cols
		 
		 int oddRows = 0, oddCols = 0;  // number of rows with odd increments and cols
		 
		 for(int i = 0; i < indices.length; i++) {
			 rowInc[indices[i][0]]++; // increment each row in indices by 1
			 colInc[indices[i][1]]++;
			 
			 //count number of rows with odd incs so far
			 if(rowInc[indices[i][0]] % 2 != 0) {
				 oddRows++;
			 }
			 else {
				 oddRows--;
			 }
			 if(colInc[indices[i][1]] % 2 != 0) {
				 oddCols++;
			 }
			 else {
				 oddCols--;
			 }
		 }
		 
		 int evenRows = n - oddRows;
		 
		 //formular for getting even cells
		 
		 return (oddRows * m) - (oddCols * oddRows) + (oddCols * evenRows);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] ab = new int[2][2];
		
		ab[0][0] = 0;
		ab[0][1] = 1;
		ab[1][0] = 1;
		ab[1][1] = 1;
				
		
		
		
		
		
		CellsWithOddValues cw = new CellsWithOddValues();
		
		System.out.println(cw.oddCells2(2, 3, ab));

	}

}
