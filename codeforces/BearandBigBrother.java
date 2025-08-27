import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weightOfLimak = sc.nextInt();
        int weightOfBob = sc.nextInt();

        // System.out.println("weightOfLimak --> " + weightOfLimak + " weightOfBob : " + weightOfBob);
        // int weightOfLimak
        int count = 0;

        while(weightOfLimak < weightOfBob){
            weightOfLimak = 3 * weightOfLimak;
            weightOfBob = 2 * weightOfBob;
            count++;
        }
        if(weightOfLimak == weightOfBob){
            count++;
        }
        System.out.println(count);
    }
}
