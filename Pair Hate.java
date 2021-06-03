import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String str = rd.readLine();     
		int n = str.length();
		Stack<Character> st = new Stack<>();
		if(n==1){
			System.out.print(str);
			return;
		}else{
			st.push(str.charAt(0));
			for(int i=1;i<n;i++)
			{
				if(st.size()>=1){
					if(st.peek()==str.charAt(i))
					{
						st.pop();
					}
					else{
						st.push(str.charAt(i));
					}
				}
				else{
					st.push(str.charAt(i));
				}
				
			}
			int x = st.size();
			char c[] = new char[x];
			for(int i=x-1;i>=0;i--){
				c[i] = st.pop();
			}
			for(int i=0;i<x;i++){
				System.out.print(c[i]);
			}
		
		}
	
	}

}
