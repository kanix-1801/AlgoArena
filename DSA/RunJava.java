public class RunJava {
    public static void main(String[] args){
        Recursion rv = new Recursion();
        // rv.fun();
        // System.out.println(rv.tailFactorial(5));
        // System.out.println(rv.palindromCheckUsingRecursion("abba"));
        // System.out.println(rv.fibonacciSeries(3));
        // System.out.println(rv.isPalindromeExist("abba"));
        // System.out.println(rv.RopeCuttingProblem(5 , 2 , 5 , 1)); // pass
        // System.out.println(rv.RopeCuttingProblem(23 , 12 , 9 , 11)); // pass
        System.out.println(rv.RopeCuttingProblem(5 , 4 , 2 , 6)); // fail
    }
}
