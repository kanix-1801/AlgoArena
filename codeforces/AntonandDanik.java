import java.util.*;

public class AntonandDanik {
    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        int numberOfGames = sc.nextInt();
        String myString = sc.next();
        char[] gameR = myString.toCharArray();

        int countA = 0;
        int countD = 0;
        for(int i = 0; i < numberOfGames; i++){
            if(gameR[i] == 'A'){
                countA++;
            }
            if(gameR[i] == 'D'){
                countD++;
            }
        }
        if(countA > countD){
            System.out.println("Anton");
        }else if(countD > countA){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }   
    }
}
