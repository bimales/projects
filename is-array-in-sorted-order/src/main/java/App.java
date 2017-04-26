
public class App {
	
	public static void main(String[] args){
		int[] array = {2, 3, 4, 5,  6};
		
		isArrayInSortedOrder(array, array.length-1);
	}

	private static void isArrayInSortedOrder(int[] array, int length) {
		System.out.println("Length of the array : " +length);
	}

}
