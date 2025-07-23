package day2;

public class Array3 {
	public static void main(String[] args) {
        int[][] matrix = { {1, 2,6},{3, 4,7},{6,9,8}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            	
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

}
}

