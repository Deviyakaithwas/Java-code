package javapractice;
import java.util.*;
public class printprimetillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high =scn.nextInt();
		
//		OPTIMAIZATION 
//   	1. ROOT N means square root N  till that w have to take that loop 
//		2. we have to take break statement.
		
		for(int num= low; num < high; num++) {
			 int div =2;
			 while ( div *div <=num) {
				 if(num % div ==0) {
					 break;
				 }
			 }
			 if(div * div >=num) {
				 System.out.println(num);
			 }
		}
	}
}
