import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter transport type: ");
        String types1 = scanner.nextLine();
        System.out.println("Enter transport brand: ");
        String brand1 = scanner.nextLine();
        Transport transport1 = new Transport(types1, brand1);

        System.out.println("Enter transport brand for 2 object: ");
        String brand2 = scanner.nextLine();

        Transport transport2 = new Transport(brand2);

        System.out.println("Enter transport year for 3 object: ");
        int year1 = scanner.nextInt();
        System.out.println("Enter transport price for 3 object: ");
        int price1 = scanner.nextInt();

        Transport transport3 = new Transport(year1, price1);

        System.out.println("Enter transport price for 4 object: ");
        int price2 = scanner.nextInt();
        Transport transport4 = new Transport(price2);

        System.out.println("Object first: ");
        System.out.println(transport1.showTransportInfo());
        System.out.println("Object Second: ");
        System.out.println(transport2.showTransportInfo());
        System.out.println("Object Third: ");
        System.out.println(transport3.showTransportInfo());
        System.out.println("Object Fourth: ");
        System.out.println(transport4.showTransportInfo());
    }
}