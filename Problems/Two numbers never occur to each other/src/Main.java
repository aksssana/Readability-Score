import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        boolean isNear = true;
        int[] numb = new int[size];
        for (int i = 0; i < size; i++) {
            numb[i] = scan.nextInt();
        }
        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 0; i < size - 1; ++i) {
            if ((numb[i] == n && numb[i + 1] == m) || (numb[i] == m && numb[i + 1] == n))
            {
                isNear = false;
                break;
            }

        }
        System.out.print(isNear);
    }
}