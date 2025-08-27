import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = -1;
        int y = -1;
        for(int i = 0; i < 5; i++){
            for(int j  = 0; j < 5; j++){
                int p = sc.nextInt();
                if(p == 1){
                    x = i;
                    y = j;
                }
            }
        }
        int ansx = 0;
        if(x != 2){
            ansx = 2 > x ? 2 - x : x - 2;
        }
        int ansy = 0;
        if(y != 2){
            ansy = 2 > y ? 2 - y : y - 2;
        }

        System.out.println(ansx + ansy);
    }
}
