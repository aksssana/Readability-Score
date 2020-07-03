import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] a = new double[]{scan.nextDouble(), scan.nextDouble()};
        double[] b = new double[]{scan.nextDouble(), scan.nextDouble()};
        double alpha = Math.acos((a[0] * b[0] + a[1] * b[1]) / (Math.hypot(a[0], a[1])
                * Math.hypot(b[0], b[1])));
        System.out.println(180 * alpha / Math.PI);
    }
}