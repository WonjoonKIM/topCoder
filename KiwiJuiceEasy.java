
public class KiwiJuiceEasy {
	public static int[] pouring(int[] capacities, int[] bottles, int[] formId, int[] toId) {
		for(int i=0; i<toId.length; i++) {
			int left=capacities[i]-bottles[i];
			
			
			if (left>0) {
				left=capacities[i]-bottles[i+1];
				capacities[i+1]+=left;
			}
			
			else if (left==0) {
				;
			}
			
			else if (left<0) {
				left=bottles[i]-capacities[i];
				capacities[i+1]-=left;
			}
			
			else{
				int allBottles=0;
				int allCapacities=0;
	
				for(int j=0; j<bottles.length; j++) 
					allBottles+=bottles[j];
				if (allBottles==0)
					break;
				
				for(int j=0; j<capacities.length; j++) 
					allCapacities+=capacities[j];
				if (allCapacities==0)
					break;
			}
				
				
			
			
			
		}//forÀÇ °ýÈ£
		
		return bottles;
		
	}//¸Þ¼ÒµåÀÇ °ýÈ£

	public static void main(String[] args) {
		
		int[] capacities= {10,10,10,10};
		int[] bottles= {8,8,8,8,8};
		int[] fromId= {0,1,2,3};
		int[] toId= {1,2,3,0};
		
		System.out.println(pouring(capacities, bottles, fromId, toId));
		
		

	}//main¸Þ¼ÒµåÀÇ °ýÈ£
	
}//Å¬·¡½ºÀÇ °ýÈ£
