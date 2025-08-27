import java.util.*;

public class VanyaAndFence{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numberOfFriends = sc.nextInt();
        int heightOfFence = sc.nextInt();
        ArrayList<Integer> friendsList = new ArrayList<Integer>();

        for(int i = 0; i < numberOfFriends; i++){
            int x = sc.nextInt();
            friendsList.add(x);
        }

        int output = getRoadWidth(numberOfFriends , heightOfFence , friendsList);
        System.out.println(output);
	}

    public static int getRoadWidth(int numberOfFriends , int heightOfFence , ArrayList<Integer> friendsList){
        int ans = 0;
        for(int i = 0; i < numberOfFriends; i++){
            if(heightOfFence >= friendsList.get(i)){
                ans++;
            }else{
                ans = ans + 2;
            }
        }
        return ans;
    }
}