import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class Main {
    
    public static long findMinTime(long n,long p , int[] arr){
        long minT = 1;
        long maxElement=Arrays.stream(arr).max().getAsInt();
        long maxT=maxElement*p;   
        long mid=0;
        while(minT<maxT){
            mid = (minT + maxT)/2;
            long sum=0;
            for(int i=0;i<n;i++){
                sum=sum+(long)(mid/arr[i]);
            }
            
            if(sum==p){
                break;
            }
            else if(sum>p){
                maxT=mid;
            }
            else{
                minT=mid+1;
            }
            
        }
        return minT;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        long plate = Long.parseLong(input[1]);
        int arr[]= new int[size];
         String[] arrInput = rd.readLine().split(" ");
        for(int i=0;i<size;i++){
            arr[i] = Integer.parseInt(arrInput[i]);
        }
         long timeTaken = findMinTime(size,plate,arr);
         System.out.println(timeTaken);
        }
}
