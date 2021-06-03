import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[] = new int[size];

            for(int k=0;k<size;k++){
                arr[k] = sc.nextInt();
            }
            int even =0;
            int odd = 0;
            for(int i=0;i<size;i++){
                if(arr[i]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(even>0 && odd>0){
                Arrays.sort(arr);
            }

            for(int k=0;k<size;k++){
               System.out.print(arr[k]+" ");
            }
	}
}
