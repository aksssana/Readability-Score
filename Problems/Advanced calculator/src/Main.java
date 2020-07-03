/* Please, do not rename it */

import java.util.Arrays;
import java.util.stream.*;

class Problem {

    public static void main(String[] args) {
        int res = Integer.parseInt(args[1]);
        switch (args[0]) {
            case "MAX": {
                for (int i = 2; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) > res) {
                        res = Integer.parseInt(args[i]);
                    }
                }
                break;
            }
            case "MIN": {
                for (int i = 2; i < args.length; i++) {
                    if (Integer.parseInt(args[i]) < res) {
                        res = Integer.parseInt(args[i]);
                    }
                }
                break;
            }
            case "SUM": {
                for (int i = 2; i < args.length; i++) {
                    res += Integer.parseInt(args[i]);
                }
                break;
            }
        }
        System.out.println(res);
    }
}
