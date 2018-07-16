import java.math.BigDecimal;
import java.util.Scanner;

public class ch20_example_2
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double double1 = keyboard.nextDouble();
        double double2 = keyboard.nextDouble();

        String double1S = Double.toString(double1);
        String double2S = Double.toString(double2);

        BigDecimal e1 = new BigDecimal(double1S);
        BigDecimal e2 = new BigDecimal(double2S);

        BigDecimal e3 = e1.subtract(e2);
        BigDecimal e4 = e3.abs();

        System.out.println("절댓값은 " + e4);
    }
}
