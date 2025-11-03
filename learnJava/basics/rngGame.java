import java.util.Scanner;
import java.util.Random;

public class rngGame{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        int attemps = 0;

        System.out.print("Please enter the min number for your range: ");
        int min = sc.nextInt();

        System.out.print("Please enter the max number for your range: ");
        int max = sc.nextInt();

        int randNum = rng.nextInt(min,max + 1);

        int guess;
        do{
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attemps++;
        }while(guess != randNum);
        System.out.println("You guess the correct number. It took you: " + attemps + " attempts");


        sc.close();
    }
}