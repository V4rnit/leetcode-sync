import java.util.Scanner;

public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number 1: ");
        double num1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter an operator(+, -, *, /, ^): ");
        char operator = sc.nextLine().charAt(0);

        System.out.println("Please enter the number 2: ");
        double num2 = sc.nextDouble();

        double res = 0;

        boolean valid = true;

        switch(operator){
            case '+' -> res = num1 + num2;
            case '-' -> res = num1 - num2;
            case '*' -> res = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by 0");
                    valid = false;
                }
                else{
                    res = num1 / num2;
                }
            }
            case '^' -> res = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid operator: ");
                valid = false;
            }
        }
        if(valid){
            System.out.printf("Result is: %.2f\n", res);
        }

        sc.close();
    }
}