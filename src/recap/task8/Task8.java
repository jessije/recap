package recap.task8;
//done
import java.math.BigDecimal;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Print number 1");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        float f1 = (float) number1;

        System.out.println("Print number 2");
        double number2 = scanner.nextDouble();
        float f2 = (float) number2;

        float result = f1 * f2;

        System.out.println(result);

        double threshold = .0001;

        double properWayDouble = 0;
        if (Math.abs(properWayDouble - result) < threshold) {
            System.out.println(result);
        }
        if (
                (  Math.abs(result-1000)<threshold  ||  result>1000  ) &&

        (  Math.abs(result-2000)<threshold  ||  result<2000)) {
            System.out.println("it is between 1000-2000 (includes)");
        } else if (result<1000) {
            System.out.println("it is below 1000");
        } else if (result > 2000) {
            System.out.println("it is above 2000");
        }
    }
}
