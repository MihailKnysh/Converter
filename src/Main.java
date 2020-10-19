import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter(28.246, 32.992, 0.329);
        int choice;
        double quantity;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What do you want to do?\n" +
                "1. Find out the exchange rate.\n" +
                "2. Convert from grn to another currency.\n" +
                "Your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(converter);
                break;
            case 2: {
                char currencyChar;
                String outputString;

                System.out.print("\nWhat currency do you want to convert grn (u, e, r)? ");
                currencyChar = scanner.next().charAt(0);
                System.out.print("How much grn do you have? ");
                quantity = scanner.nextDouble();

                switch (currencyChar) {
                    case 'u':
                        outputString = String.format("\n%.3f grn to usd is %.3f", quantity, quantity / converter.getUsdRate());
                        System.out.println(outputString);
                        break;
                    case 'e':
                        outputString = String.format("\n%.3f grn to eur is %.3f", quantity, quantity / converter.getEurRate());
                        System.out.println(outputString);
                        break;
                    case 'r':
                        outputString = String.format("\n%.3f grn to rub is %.3f", quantity, quantity / converter.getRubRate());
                        System.out.println(outputString);
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
                break;
            }

            default:
                System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
