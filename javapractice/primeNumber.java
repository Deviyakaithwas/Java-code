package javapractice;
import java.util.*;
public class primeNumber {
	public static void main(String[] args) {
	
//		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int i = t;i<t ;i++){
            int n = sc.nextInt();
            int div = 2;
            while( div * div <=n){
                if(n % div ==0){
                    break;
                }
                div++;
            }
            
            if(div*div < n){
                System.out.println("prime");
            }else{
                System.out.println("Not prime");
            }
        }	
	}
}

