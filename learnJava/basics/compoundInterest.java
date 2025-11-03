import java.util.Scanner;
public class compoundInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the compound interest calculator");

        System.out.print("Enter the principle deposit: ");
        double principle = sc.nextDouble();

        System.out.print("Enter the rate of interest you would like: ");
        double rate = sc.nextDouble()/100;

        System.out.printf("Enter the number of compounding periods: ");
        int period = sc.nextInt();

        System.out.print("Enter the time (in years)");
        int time = sc.nextInt();

        double a = principle * Math.pow((1 + rate), period * time);

        System.out.printf("The final amount is: $ %.2f\n", a);
        sc.close();
    }
}
