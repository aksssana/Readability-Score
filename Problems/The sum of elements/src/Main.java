import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int m = scanner.nextInt();
        while (m != 0) {
            sum += m;
            m = scanner.nextInt();
        }
        System.out.println(sum);
    }
}