package Tasks;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(6));
        System.out.println(iterativeFibonacci(6));
        System.out.println(dynamicFibonacci(6));

    }
    public static int iterativeFibonacci(int n) {
        if (n <= 1)
            return n;

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

    public static int recursiveFibonacci(int n) {
        if (n <= 1)
            return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static int dynamicFibonacci(int n) {
        int[] fibArr = new int[n + 2];
        fibArr[0] = 0;
        fibArr[1] = 1;

        for (int i = 2; i <= n; i++)
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];

        return fibArr[n];
    }


}