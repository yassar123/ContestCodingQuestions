import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
        // Your code here
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		String v[]=rd.readLine().split(" ");
		int n=Integer.parseInt(v[0]);
		int m=Integer.parseInt(v[1]);
		String x[]=rd.readLine().split(" ");
		int a[] = new int[n];
		int b[] = new int[m];
		
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(x[i]);
		}
		String y[]=rd.readLine().split(" ");
		for(int i=0;i<m;i++){
			b[i] = Integer.parseInt(y[i]);
		}
		int count = 0;
		int minimum = Integer.MAX_VALUE;
		for(int i=0;i<=(n-m);i++){
			count=0;
			for(int j=0;j<m;j++){
				if(a[i+j]!=b[j]){
					count++;
				}
			}
			minimum = Math.min(minimum,count);

		}
		System.out.print(minimum);
	}
}
