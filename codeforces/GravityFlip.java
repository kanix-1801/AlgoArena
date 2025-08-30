import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfInputs = sc.nextInt();
        ArrayList <Integer> inputArray = new ArrayList<>();

        for(int i = 0; i < noOfInputs; i++){
            inputArray.add(sc.nextInt());
        }

        Collections.sort(inputArray);

        for (Integer i : inputArray) {
            System.out.print(i + " ");
        }
    }
}
