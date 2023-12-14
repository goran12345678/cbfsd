
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//An array is a data structure that allows users
		//to store a fixed-size of values of the SAME DATA TYPE
		int[] array1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		//zero base arrays in Java which means the first element is at index 0
		//System.out.println(array1[9]);
		
		//int[] array2 = new int[5];
		//array2[3] = 30;
		//System.out.println(array2[3]);
		
		//Single-Dimensional Array
		//type[] name = new type[5]
		
		//String[] name = new String[4];
		
		//Multi_Dimensional Array
		//String[][] names; //two dimensional array
		int[][] number = {
				{1,2,3,4,5},
				{6,7,8,9,10} 
				};
		//similar to a table with columns and rows.
		//int[] store the position of the rows
		//int[][] store the position of the columns
		for(int i = 0; i < number.length; i++) {
			for(int j = 0; j < number[i].length; j++) {
				System.out.println(number[i][j] + " \t");
			}
			System.out.println("i " + i);
		}
	}
}
