import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.lang.Math;
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long arr1[] = new long[num];
		long arr2[] = new long[num];
		long maxX = Integer.MIN_VALUE;
		long minX = Integer.MAX_VALUE;
		long maxY = Integer.MIN_VALUE;
		long minY = Integer.MAX_VALUE;
		for(int i=0;i<num;i++)
		{
			arr1[i] = sc.nextLong();
			if(arr1[i]>maxX)
			maxX = arr1[i];
			if(arr1[i]<minX)
			minX = arr1[i];

			arr2[i] = sc.nextLong();
			if(arr2[i]>maxY)
			maxY = arr2[i];
			if(arr2[i]<minY)
			minY = arr2[i];
		}
		System.out.print((maxX-minX)*(maxY-minY));
	}
}
