//To take in user input (name, class, number of exams etc..) and generate the average of the class so far
import java.util.Scanner;

public class projectOne{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the course name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter score 1: ");
        double scoreOne = sc.nextDouble();


        System.out.print("Enter score 2: ");
        double scoreTwo = sc.nextDouble();
        
        System.out.print("Enter score 3: ");
        double scoreThree = sc.nextDouble();

        double averageScore = (scoreOne + scoreTwo + scoreThree) / 3;

        System.out.println("Hello, \n" + name);
        System.out.printf("Your average score is: %.2f: \n", averageScore);
        
        sc.close();
    }
}