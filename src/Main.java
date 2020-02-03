import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st value: " );
        float one = scan.nextFloat();
        System.out.print("Enter the 2nd value: " );
        float two = scan.nextFloat();
        System.out.print("Choos an operation (/ * + -): " );
        int s = scan.nextInt(), answer = 0;
        switch (s){
            case 1:
                answer  = (int) (one/two);
                break;
            case 2:
                answer  = (int) (one*two);
                break;
            case 3:
                answer  = (int) (one+two);
                break;
            case 4:
                answer  = (int) (one-two);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + s);
        }

        System.out.println("The answer is: " +answer);
    }
}
