package javapractice;
import java.util.*;
public class printtillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();
		
		for(int n =low; n<= high; n++) {
			
			int count = 2;
			for(int div = 2; div * div <= n; div ++) {
				if(n % div ==0);
				count++;
				break;
			}
			if(count==0){
				System.out.println(n);
			}
		}
		
	}

}
