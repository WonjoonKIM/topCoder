
public class ThePalindrome {
	public static int find(String[] s) {
		for(int i=0; i<s.length; i++) {
			for(int j=1; j<s.length; j++) {
				if(s[i]!=s[j]) return s.length+s.length-1; 	//�ϳ��� �ݺ��� ��� �׳� �������� ���� ���̸� �Ǵ� ���
				
				if(s[i]==s[s.length-i-1]) { //�̹� ȸ���̶� �߰��� �� ����
					for(int k=0; k<s.length; k++) {
						if(s[k]!=s[s.length-k-1]) break;
					}
					return s.length;
				}//if���� ��ȣ
				
				if(s[i]!=s[s.length-i-1]) 
				}
				
				
		}//j�� ��ȣ
			
		}//i�� ��ȣ
		
		
		
		
	}

	public static void main(String[] args) {
		
		String[] s= {"a","b","a","b"};
		System.out.println("ȸ���� ������= "+find(s));
		

	}

}
