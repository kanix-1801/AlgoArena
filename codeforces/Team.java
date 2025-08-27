import java.lang.reflect.Array;
import java.util.*;

public class Team {
   public static void main(String[] args) {

        // input 
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int totleQuestions = sc.nextInt();
        ArrayList<ArrayList<Integer>> ansKnown = new ArrayList<>();

        for(int i = 0; i < totleQuestions; i++){
            ArrayList<Integer> opinion = new ArrayList<>();
            for(int j = 0; j < 3; j++){
                int x = sc.nextInt();
                opinion.add(x);
            }
            ansKnown.add(opinion);
        }
        
        for(int i = 0; i < totleQuestions; i++){
            ArrayList<Integer> opinions = ansKnown.get(i);
            int oneCount = 0;
            for(int j = 0; j < 3; j++){
                if(opinions.get(j) == 1){
                    oneCount++;
                }
            }
            if(oneCount >= 2){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
