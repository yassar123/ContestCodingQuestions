import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		// Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r;
		int change = 0;
		if(n<=400)
		{
			if(n%200==0){
				change =0;
			}
		else{
			r=n/200;
			change=200*(r+1) - n;
		}
		}
		else if(n>400)
		{
			if(n%100 == 0)
			{
				change = 0;
			}
			else{
				r=n/100;
				change = 100*(r+1) - n;
			}
		}
		System.out.print(change);
	}
}
