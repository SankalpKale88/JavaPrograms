public class MatrixMultiplicationNormal {

	public static void main(String[] args) {
		int data[] = new int[4];
		int array1[][] = {{1,5,1},{1,4,1},{1,2,3}};
		int array2[][] = {{1,1,1},{1,2,1,},{1,2,3}};
		int arrayResult[][]= new int[4][4];
		
		for(int i=0;i < 3 ; i ++){
			for(int j=0;j<3;j++){
				arrayResult[i][j]=0;
				for(int k =0;k<3;k++){
					arrayResult[i][j] = arrayResult[i][j] + (array1[i][k]*array2[k][j]);
				}
			}
		}
		System.out.println("Result matrix:");
		for(int i=0;i<3;i++){
			for (int j = 0; j < 3; j++) {
				System.out.print("\t"+arrayResult[i][j]);
			}
			System.out.println("\n");
		}
	}
}
