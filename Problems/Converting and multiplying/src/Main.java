import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "8";
        while (scanner.hasNext()) {
            try {
                a = scanner.next();
                if (Integer.parseInt(a) == 0)
                    break;
                System.out.println(Integer.parseInt(a) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + a);
            }
        }
    }
}