import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
      BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String[] st = rd.readLine().split(" ");
		
		long n =Long.valueOf(st[0]);
		long a = Long.valueOf(st[1]);
		long b = Long.valueOf(st[2]);
		long  bg=a+b;
		long  res=n/bg;
		long  rem=n%bg;
		long ans=res*a;
		if(rem<=a){
			ans=ans+rem;
		}
		else{
			ans=ans+a;
		}
			System.out.print(ans);
		
	}
}
