package javapractice;
import java.util.Scanner;
public class solution {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		//		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in)) {
			//		string input 
					String name = sc.nextLine();
					
			//		character input
					char gender = sc.next().charAt(0);
					
			//		number or numeral data input
			//		byte or short input
			//		Similar to named function
					int age = sc.nextInt();
					long mobileNo= sc.nextLong();
					double cpga = sc.nextDouble();
					
					
			//		print the values to check to the input s correct obtained or not.
					System.out.println("Name: " + name);
					System.out.println("gender: " + gender);
					System.out.println("age: " + age);
					System.out.println("mobile no: " + mobileNo);
					System.out.println("cpga: " + cpga);
		}
	}

}
