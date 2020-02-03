import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st value: " );
        String one = scan.nextLine();
        System.out.print("Enter the 2nd value: " );
        String two = scan.nextLine();
        System.out.print("Choose an operation (/ * + -): " );
        String s = scan.next();
        double answer = 0;
        switch (s){
            case "/":
                answer  = divideValues(one,two);
                break;
            case "*":
                answer  = multiplyValues(one,two);
                break;
            case "+":
                answer  = addValues(one,two);
                break;
            case "-":
                answer  = subtractValues(one,two);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + s);
        }

        System.out.println("The answer is: " +answer);
    }
    private static double addValues(String one, String two) {
        double d1 = Double.parseDouble(one);
        double d2 = Double.parseDouble(two);
        return d1 + d2;
    }
    private static double multiplyValues(String one, String two) {
        double d1 = Double.parseDouble(one);
        double d2 = Double.parseDouble(two);
        return d1 * d2;
    }
    private static double divideValues(String one, String two) {
        double d1 = Double.parseDouble(one);
        double d2 = Double.parseDouble(two);
        return d1 / d2;
    }
    private static double subtractValues(String one, String two){
        double d1 = Double.parseDouble(one);
        double d2 = Double.parseDouble(two);
        return d1-d2;
    }
}
