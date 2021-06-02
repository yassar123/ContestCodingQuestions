import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int countOne = 0,countZero = 0;
        int result=0;
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]==1)
            countOne++;
        }
        if(countOne!=(size-countOne))
        {
            System.out.println("-1");
        }
        else
        {
            
            for(int i = 0;i<size;i++)
            {
                if(arr[i]==0)
                {
                countZero++;
                }
                else
                countZero--;
                if(countZero==0)
                result++;
            }
        System.out.println(result);
        }
	}
}
