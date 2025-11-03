import java.util.Scanner;

public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the bank");
        double totalMoney = 0;
        boolean loop = true;

        while(loop) {
            System.out.println("Please choose 1 to show balance, 2 to deposit, 3 to withdraw");
            int choice = sc.nextInt();

            if(choice == 1){
                showBalance(totalMoney);
            } else if(choice == 2){
                totalMoney = deposit(totalMoney, sc);  // must match method signature
            } else if (choice == 3){
                totalMoney = withdraw(totalMoney, sc); // must match method signature
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.print("To exit please enter false, otherwise enter true: ");
            loop = sc.nextBoolean();
        }

        sc.close();
    }

    // showBalance does NOT need Scanner
    public static void showBalance(double money){
        System.out.printf("Your balance is: %.2f\n", money);
    }

    // deposit MUST accept Scanner as second parameter
    public static double deposit(double money, Scanner sc){
        System.out.print("Please enter the amount of money you would like to deposit: ");
        double deposit_money = sc.nextDouble();
        return money + deposit_money;
    }

    // withdraw MUST accept Scanner as second parameter
    public static double withdraw(double money, Scanner sc){
        System.out.print("Please enter the amount of money you would like to withdraw: ");
        double withdraw_money = sc.nextDouble();

        while(withdraw_money > money){
            System.out.print("Error, insufficient funds. Enter a valid amount: ");
            withdraw_money = sc.nextDouble();
        }
        return money - withdraw_money;
    }
}
