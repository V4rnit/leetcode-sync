import java.util.Scanner;
public class enhancedSwitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a day of the week to evaluate: ");
        String day = sc.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Today is a weekday");
            case "Saturday", "Sunday" -> System.out.println("Today is a weekend");
            default -> System.out.println(day + " is not a day");
        }

        sc.close();
    }
}
