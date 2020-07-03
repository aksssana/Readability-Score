import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        String substr=scanner.nextLine();
        System.out.println(line.split(substr,-1).length-1);

    }
}