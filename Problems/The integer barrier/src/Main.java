import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int sum = 0;
        a = scan.nextInt();
        while (a != 0) {
            sum += a;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
            a = scan.nextInt();
        }
        System.out.println(sum);
    }
}