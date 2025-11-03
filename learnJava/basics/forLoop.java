import java.util.Scanner;

public class forLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Reverse print:");
        for (int i = num; i > -1; i--) {
            System.out.println(i);
        }

        System.out.println("Correct print:");
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
