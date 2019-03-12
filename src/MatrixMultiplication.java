import java.util.Scanner;


public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns of first matrix");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		System.out.println("Enter the rows and columns of second matrix");
		int row2 = sc.nextInt();
		int col2= sc.nextInt();
		
		if(col1 != row2){
			System.out.println("We can not mulitply these matrices");
			System.exit(0);
		}
		
		int array1[][] = new int[row1][col1];
		int array2[][] = new int[row2][col2];
		
		System.out.println("Enter matrix 1:");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		
	
		System.out.println("Enter matrix 2:");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				array2[i][j] = sc.nextInt();
			}
		}
		
		int arrayResult[][] = new int[row1][col2];
		System.out.println("Multiplying matrix 1 and 2");
		for(int i=0;i < row1 ; i ++){
			for(int j=0;j<col2;j++){
				arrayResult[i][j]=0;
				for(int k =0;k<col1;k++){
					arrayResult[i][j] = arrayResult[i][j] + (array1[i][k]*array2[k][j]);
				}
			}
		}
		
		System.out.println("Result matrix:");
		for(int i=0;i<row1;i++){
			for (int j = 0; j < col2; j++) {
				System.out.print("\t"+arrayResult[i][j]);
			}
			System.out.println("\n");
		}

}
}