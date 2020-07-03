import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numb = new int[size];
        for (int i = 0; i < size; i++) {
            numb[i] = scan.nextInt();
        }
        int sum = 0;
        int n = scan.nextInt();
        for (int elem : numb) {
            if (elem > n) {
                sum += elem;
            }
        }
        System.out.print(sum);
    }
}