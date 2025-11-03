import java.util.Scanner;

public class methods{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        greeting(name);

        System.out.print("Please enter a number to square: ");
        double num = sc.nextDouble();
        System.out.println(squareNum(num));

        System.out.println("Please enter a number to cube: ");
        double num1 = sc.nextDouble();
        System.out.printf("%.2f\n", cubeNum(num1));
        sc.nextLine();

        System.out.print("Enter your first name: ");
        String first = sc.nextLine();

        System.out.println("Enter your last name: ");
        String last = sc.nextLine();

        System.out.println("Your full name is: " + getFullName(first, last));

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        boolean check = ageCheck(age);
        if(check){
            System.out.println("You are above age");
        }
        else{
            System.out.println("You are underage");
        }

        sc.close();
    }



    static void greeting(String userName){
        System.out.println("Welcome to the java program");
        System.out.println("Hope you enjoy " + userName);
    }
    static double squareNum(double n){
        return n * n;
    }
    static double cubeNum(double num){
        return num * num * num;
    }
    static String getFullName(String a, String b){
        return a + " " + b;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
        // return (age >= 18) ? true : false
    }
}