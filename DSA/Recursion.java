public class Recursion {
    static void fun(){
        System.out.println(naturalNumberSum(8));
    }

    static void printNto1UsingRecursion(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNto1UsingRecursion(n - 1);
    }
    static void print1toNUsingRecursion(int n){
        if(n == 0){
            return;
        }
        print1toNUsingRecursion(n - 1);
        System.out.println(n);
    }
    static int naturalNumberSum(int n){
        if(n == 0){
            return 0;
        }
        return n + naturalNumberSum(n - 1);
    }

    // ex : factorial 
    // tail recursion --> 
    static int tailFactorial(int k , int n){
        if(n == 0){
            return k;
        }
        k = n * k;
        return tailFactorial(k , n - 1);
    }
    // non-tail recursion -->
    static int NonTailFactorial(int n){
        // base case
        if(n == 0){
            return 1;
        }
        return n * NonTailFactorial(n - 1);
    }

    static int tailFactorial(int n){
        return tailFactorial(1, n);
    }
    // see palindrom in string using the recursion 
    static boolean palindromCheckUsingRecursion(String str , String reverseString , int index){
        if(str.length() <= reverseString.length()){
            return (str.equals(reverseString));
        }
        reverseString = str.charAt(index) + reverseString;
        return palindromCheckUsingRecursion(str , reverseString , index + 1);
    }

    static boolean palindromCheckUsingRecursion(String str){
        return palindromCheckUsingRecursion(str , "" , 0);
    }

    static int fibonacciSeries(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);

    }
    static boolean isPalindromeExist(String str , int startIndex , int endIndex){
        if(str.charAt(endIndex) != str.charAt(startIndex)){
            return false;
        }
        if(startIndex >= endIndex){
            return true;
        }

        return isPalindromeExist(str, startIndex + 1, endIndex - 1);
    }
    static boolean isPalindromeExist(String str){
        int endIndex = str.length() - 1;
        return isPalindromeExist(str , 0  , endIndex);
    }

    static int RopeCuttingProblem(int n , int a , int b , int c){
        if(n < 0){
            return -1;
        }
        if(n == 0){
            return 0;
        }

        int x =  RopeCuttingProblem(n - a , a , b , c);
        int y = RopeCuttingProblem(n - b , a , b , c);
        int z = RopeCuttingProblem(n - c , a , b , c);

        int max = ((x > y) && (x > z)) ? x : ((y > z) ? y : z);
        if(max < 0){
            return -1;
        }
        return max + 1;
    }
}
