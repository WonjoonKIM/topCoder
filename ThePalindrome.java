
public class ThePalindrome {
	public static int find(String[] s) {
		for(int i=0; i<s.length; i++) {
			for(int j=1; j<s.length; j++) {
				if(s[i]!=s[j]) return s.length+s.length-1; 	//하나도 반복이 없어서 그냥 마지막꺼 빼고 붙이면 되는 경우
				
				if(s[i]==s[s.length-i-1]) { //이미 회문이라 추가할 것 없음
					for(int k=0; k<s.length; k++) {
						if(s[k]!=s[s.length-k-1]) break;
					}
					return s.length;
				}//if문의 괄호
				
				if(s[i]!=s[s.length-i-1]) 
				}
				
				
		}//j의 괄호
			
		}//i의 괄호
		
		
		
		
	}

	public static void main(String[] args) {
		
		String[] s= {"a","b","a","b"};
		System.out.println("회문의 갯수는= "+find(s));
		

	}

}
