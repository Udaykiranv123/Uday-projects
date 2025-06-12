package dsa;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a age:");
		int age = sc.nextInt();
		if(age<=17) {
			System.out.println("the person is teen");
		}
		else if(age>=18 && age<=40) {
			System.out.println("the person is younger");
		}
		else
		{
			System.out.println("the person is old");
		}
	}
}