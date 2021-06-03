import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
        // Your code here
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       String str=br.readLine();
			int count=0,max=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='A')
					count++;
				if(count>max)
					max=count;
				if(str.charAt(i)!='A')
					count=0;
		    }
			System.out.println(max);
	}
}
