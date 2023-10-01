package javapractice;

public class solution3 {
	
	    public static int sumOFALLDivision(int n){
	        int sum =0;
	        for(int i =1;i<n+1;i++){
	            for(int j =1;j<i+1;j++){
	                if(i%j==0){
	                    return sum+=i/j;
	                }
	            }
	        }
			return sum;
	    }
}
