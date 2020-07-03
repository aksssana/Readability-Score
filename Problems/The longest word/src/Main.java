import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maxString = "";
        String[] str = scanner.nextLine().split(" ");
        for (var string : str) {
            if (string.length() > maxString.length())
                maxString = string;
        }
        System.out.println(maxString);
    }
}