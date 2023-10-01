package javapractice;
import java.util.Scanner;
public class gradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
//		int b = sc.nextInt();
		
		if(marks > 90){
			System.out.println("Excellent");
		}else if(marks > 80){
			System.out.println("Very Good");
		}else if(marks > 70){
			System.out.println("Good");
		}else if(marks > 55){
			System.out.println("average");
		}else if(marks > 35){
			System.out.println("pass");
		}
	}

}
