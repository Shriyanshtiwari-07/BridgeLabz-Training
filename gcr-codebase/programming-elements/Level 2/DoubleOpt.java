import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double result1 = a + b * c;   // * has higher precedence than +
        double result2 = a * b + c;   // * evaluated before +
        double result3 = c + a / b;   // / evaluated before +
        double result4 = a % b + c;   // % evaluated before +

        System.out.println(
            "The results of Double Operations are " +
            result1 + ", " + result2 + ", " + result3 + ", " + result4
        );

        sc.close();
    }
}
