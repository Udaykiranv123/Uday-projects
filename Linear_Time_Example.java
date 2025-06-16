
package app;

public class Linear_Time_Example {
	public static void printAllElements(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element"+i+":"+arr[i]);
		}
	}

	public static void main(String[] args) {
		int [] numbers= {11,22,33,44,55,66,77,88,99};
		 printAllElements(numbers);

	}

}
