import java.util.Scanner;
public class ternary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(evenOrOdd);

        System.out.print("Please enter the time of the day (military): ");
        int time = sc.nextInt();

        String tellTime = (time >= 12) ? "PM" : "AM";
        System.out.println(tellTime);
        sc.close();
    }
}
