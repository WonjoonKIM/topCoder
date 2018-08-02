 
public class Interesting_Party {

	public static void main(String[] args) {
		String[] first= {"fishing", "hunting", "camping", "riding"};
		String[] second= {"hunting", "camping", "riding", "camping"};
		
		System.out.println(bestInvitation(first, second));
		
	}
	
	public static int bestInvitation(String[] first, String[] second) {
		int[] count= {0};
		int c=0;
		
		for(int i=0; i<first.length; i++) {
			for(int j=0; j<second.length; j++) {
				  if(first[i]==second[j]) 
					  c++;
			}
			count[i]=c;
			c=0;
		}
		
		int smallest=count[0];
		
		for(int b=0; b<count.length; b++) {
			if(count[b]>count[0])
				smallest=count[b];
		}
		
		return smallest;

	}

}
