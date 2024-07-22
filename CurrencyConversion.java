import java.util.Scanner;

public class CurrencyConversion{
    public static void main(String[] args){
        System.out.println(" 1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");

        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        // convert amount
        switch (choice){
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");


        }

    }
    public static void Ruppe_to_other(double amount){
        System.out.println("1 Ruppe = " + 0.012 + "Dollar");
        System.out.println();

        System.out.println(amount + " Ruppe = " + (amount * 0.012) + " Dollar");
        System.out.println();

        System.out.println("1 Ruppe = " + 0.011 + " Euro");
        System.out.println();
        System.out.println(amount + " Ruppe = " + (amount * 0.011) + " Euro");
        System.out.println();

    }
    public static void Dollar_to_other(double amount){
        System.out.println("1 Dollar = " + 83.67 + " Ruppe");
        System.out.println();
        System.out.println(amount + " Dollar = " + (amount * 83.67) + " Ruppe");

        System.out.println(" 1 Dollar = " + 0.92 + " Euro");
        System.out.println();
        System.out.println(amount + " Dollar = " + (amount * 0.92) + " Euros");


    }
    public static void Euro_to_other(double amount){
        System.out.println("1 Euro = " + 91.0 + " Ruppe");
        System.out.println();
        System.out.println(amount + " Euro " + (amount * 91.0) + " Ruppe");
        System.out.println();

        System.out.println("1 Euro = " + 1.0 + " Dollar");
        System.out.println();
        System.out.println(amount + " Euro "+  (amount * 1.0) + " Dollar");

    }
}

