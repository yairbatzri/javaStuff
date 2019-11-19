package Array;

public class MatrixArrays {

	public static void main(String[] args) {

		int[] regular = new int[3];
		int[] regular2 = new int[3];
		int[] regular3 = new int[3];
		int[][] matrix = { regular, regular2, regular3 };

		for (int[] array : matrix) {
//			System.out.println(Arrays.toString(array));
		}

		int[][] intMatrix = new int[2][3];

		System.out.println(intMatrix.length);
//		System.out.println(Arrays.deepToString(intMatrix));
	}

}
