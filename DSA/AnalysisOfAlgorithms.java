public class AnalysisOfAlgorithms{
    public static void main(String[] args){
        // sum of first n natural
        // System.out.println("sum of first n natural is : " + SumOfN_NaturalNumbers(3));
        // System.out.println("count : " + CountDigits(311));
        // System.out.println(factorialOfNumberWithRecursion(5));
        // System.out.println(factorialOfNumber(5));
        // printNameNTimes(5);
        printNDigits(5);
        printNDigitsRecurse(5);
        // System.out.println(isPalindromeNumbers(1201));
    }

    public static int SumOfN_NaturalNumbers(int n){
        // int count = 0;
        // for(int i = 0; i <= n; i++){
        //     count = count + i;
        // }
        // return count;  // T.C. --> O(n)

        // trick --> get n Natural Number sum --> (n * (n + 1)) / 2
        return (n * (n + 1)) / 2;
    }

    public static int CountDigits(int n){
        int CountDigit = 0;
        int num = n;
        while(num > 0){
            num = num / 10;
            CountDigit++;
            System.out.println("num " + num + " CountDigit " + CountDigit);
        }
        return CountDigit;
    }

    public static String isPalindromeNumbers(int n){
        int temp = n;
        int reverseNum = 0;
        while(temp > 0){
           reverseNum = (reverseNum * 10) +  temp % 10;
           temp = temp / 10;
        }
        if(n == reverseNum){
            return "yes";
        }
        return "No";
    }
    
    public static int factorialOfNumber(int n){
        int factorialValue = 1;
        for(int i = 1; i <= n; i++){
            factorialValue = factorialValue * i;
        }
        return factorialValue;
    }
    // Recursion problem
    public static int factorialOfNumberWithRecursion(int n){
        if(n < 0 || n == 1){
            return 1;
        }
        return (n *  factorialOfNumberWithRecursion(n - 1));
    }

    public static void printNameNTimes(int n){
        if(n <= 0){return ;}
        System.out.println("kanishk");
        printNameNTimes(n - 1);
    }

    // print linearly from 1 to n in reverse
    public static void printNDigits(int n){
        if(n <= 0){
            return;
        }
        printNDigits(n - 1);
        System.out.println(n);
    }

    // print linearly from 1 to n in liner
    public static void printNDigitsRecurse(int n){
        if(n <= 0){
            return;
        }
        System.out.println(n);
        printNDigits(n - 1); 
    }
}