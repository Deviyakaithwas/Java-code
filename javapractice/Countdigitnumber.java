package javapractice;
import java.util.*;
public class Countdigitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int digit =0;
		// when the n is not equal to the 0 then while loop start and until continue to get 0
		while(n!=0){
			n= n/10;
			digit++;
		}
		//if the digit is 0 , so it direct print digit i.e the condition is true .
		System.out.println(digit);
	}

}
