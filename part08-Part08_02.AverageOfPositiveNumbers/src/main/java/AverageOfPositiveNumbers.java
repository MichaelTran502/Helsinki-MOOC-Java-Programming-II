
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("0")) {
                break;
            }
            
            int value = Integer.valueOf(input);
            if (value > 0) {
                sum += value;
                count++;
            }
        }
        
        if (count != 0) {
            System.out.println(1.0*sum/count);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
