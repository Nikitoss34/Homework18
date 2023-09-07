import java.util.Locale;
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinksService service = new DrinksService();
        while (true) {
            service.menu();
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("0") || choice.equalsIgnoreCase("exit"))
                break;

            service.calculatePrice(choice);
        }
        System.out.println("total price for drinks = " + service.getTotalSum() + " total ordered drinks =" + service.getCountDrinks());


    }
}