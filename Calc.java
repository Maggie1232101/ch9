import java.util.Arrays;

public class Calc {
    public static int add(String[] args) {
        int sum = 0;
        for (int i = 1; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        return sum;
    }
    public static int mult(String[] args) {
        int product = 1;
        for (int i = 1; i < args.length; i++) {
            product *= Integer.parseInt(args[i]);
        }
        System.out.println(product);
        return product;
    }
    public static int max(String[] args) {
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > res) {
                res = Integer.parseInt(args[i]);
            }
        }

        System.out.println(res);
        return res;
    }
    public static int min(String[] args) {
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i]) < res) {
                res = Integer.parseInt(args[i]);
            }
        }

        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("<add|mult|max|min> <numbers>");
            return;
        }
        else if (args[0].equals("add")) {
            add(args);
        } else if (args[0].equals("mult")) {
            mult(args);
        } else if (args[0].equals("max")) {
            max(args);
        } else if (args[0].equals("min")) {
            min(args);
        } else {
            System.out.println("Unknown operation: " + args[0]);
        }
    }
}
