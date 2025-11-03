import java.util.Scanner;

public class shoppingCart {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("What items would you like to buy?: ");
        String item = sc.nextLine();

        System.out.print("What is the price for each?: ");
        double price = sc.nextDouble();

        System.out.print("How many would you like?: ");
        int quantity = sc.nextInt();

        double total = price * quantity;
        System.out.println("You have bought " + quantity + " "+ item +"/s");
        System.out.printf("Your total is:$%.3f \n", total);
        sc.close();
    }
}
