
public class InterestingDigits {
	public static int[] digits(int base) {
		int[] whatWeWant= {0};
		
		    for(int i=3; i<=30; i++) {
		    	for(int j=1; ; j++) {
		    		if(i*j>=100 && i*j<=999) {
		    			
		    			int mul=i*j;
		    			int a=mul/100;
		    			int b=(mul%100)/10;
		    			int c=(mul%100)%10;
		    			int seq=a+b+c;
		    			
		    			if (seq%i==0) 
		    				whatWeWant[i]=i;
		    			
		    		}//if문
		    	}//j반복문
		    	
		    }//i반목문
		    return whatWeWant;
	}//메소드

	public static void main(String[] args) {
	
				
		System.out.println("결과 값은 "+ digits(10) );
		
		
		

	}

}
