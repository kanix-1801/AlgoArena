import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfTestCase = sc.nextInt();
        
        // ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < numberOfTestCase; i++){
            long n = sc.nextInt();
            long a = sc.nextInt();
            long b = sc.nextInt();
            giveAns(n,a,b);
        }
    }

    public static void giveAns(long n , long a , long b){
         if ((a == b) && (a == n)){
            System.out.println("YES");
         }else{
            if( b > a && a + b >= n + 1){
                System.out.println("YES");
            }else if(a > b && a + b >= n + 1){
                if(((a - b) % 2) == (n % 2)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }    
    }
}
