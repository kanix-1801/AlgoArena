import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstStr = sc.next();
        String secString = sc.next();

        int x = 0;
        int y = 0;

        for(int i = 0; i < firstStr.length(); i++){
            x += (int) firstStr.toLowerCase().charAt(i); 
            y += (int) secString.toLowerCase().charAt(i); 
        }

        // for(int i = 0; i)

        if(x == y){
            System.out.println("0");
        }else{
            System.out.println(x > y ? "1" : "-1");
        }

    }
}
