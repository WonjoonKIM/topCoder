public class Cryptography {
	
	public static int encrypt(int[] numbers) {
		int all=1;
		int largest=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i]++;
			for(int j=0; j<numbers.length; j++) {
				all*=numbers[j];
			}
			numbers[i]--;
			
			if( largest<all)
				largest=all;
			
			all=1;
		}
		
		return largest;
	}
	

	public static void main(String[] args) {
		
		int[] numbers= {1,1,1,1};

		
		
		System.out.println("답은 말이쥐 "+encrypt(numbers)+"이야" );
		

	}

}
