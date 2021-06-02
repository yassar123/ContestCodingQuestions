import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isPrime(int k){
        for(int i = 2; i*i<=k; i++){
            if(k%i == 0){
                return false;
            }
        }
        return true;
    }
    
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            n++;
        }
        if(isPrime(n)){
            System.out.println(n);
            return;
        }
        boolean b = true;
        int nn = --n, np = ++n;
        while(b){
            boolean k = isPrime(nn);
            if(!k){
                boolean l = isPrime(np);
                if(l){
                    System.out.println(np);
                    b = false;
                }
                else{
                    nn--;
                    np++;
                }
            }
            else{
                System.out.println(nn);
                b = false;
            }
        }
	}
}
