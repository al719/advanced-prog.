
public class Q5 {

	public static void main(String[] args) {
		int[] array  = { 1 , 2 , 3 , 4 , 5 } ;
		sumOfArray(array);

	}
	static void sumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0 ; i< array.length ; i++ ) {
			sum += array[i];
		
		}
		System.out.println(" the sum of the array equals " + sum );
	}

}
