import java.util.Scanner;
public class weightConverted {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 1 if you like to convert your weight from pounds to kg else type any other number: ");
        int flag = sc.nextInt();

        if(flag == 1){
            System.out.print("Please enter you weight in pounds: ");
            double weightLbs = sc.nextDouble();
            weightLbs /= 2.205;
            System.out.printf("Your weight in kgs is: %.2f: \n", weightLbs);
        }
        else{
            System.out.print("Please enter your weight in Kgs: ");
            double weighKgs = sc.nextDouble();

            weighKgs *= 2.205;
            System.out.printf("Your weight in lbs is: %.2f: \n", weighKgs);
        }

        sc.close();
    }
}
