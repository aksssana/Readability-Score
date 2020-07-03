import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1, res;
        while (factorial(n) <= m) {
            n += 1;
        }
        System.out.println(n);
    }

    private static long factorial(long n) {
        if (n == 1 || n == 0) {
            return 1;
        } else
            return n * factorial(n - 1);
    }
}