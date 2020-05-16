
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            values.add(input);
        }
        
        values.stream()
                .filter(i -> i >= 1 && i <= 5)
                .forEach(i -> System.out.println(i));
    }
}
