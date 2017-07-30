
public class StringsQ4 {

	private static char[] ReplaceAndRemove(char[] list) {
		// remove b
		int current=-1;
		for(int i=0;i<list.length;i++) {
			if(list[i]!='b') {
				list[++current]=list[i];
			}

		}
		// add two 'd' for every a
		// count a
		int a_count=0;
		for(int j=0;j<list.length;j++) {
			if(list[j]=='a') {
				a_count++;
			}
		}
		
		int last_index=a_count+ current;
		for(int q=current;q>=0;q--) {
			if(list[q]=='a') {
				list[last_index--]='d';
				list[last_index--]='d';
			}
			else {
				
				list[last_index--]=list[q];
			}
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// assuming input array has sufficient space to hold result
		char[] c= {'a','b','a','r','b'};
		char[] p= ReplaceAndRemove(c);
		for(char x : p) {
			System.out.println(x);
		}
	}

}
