import java.util.Scanner;
public class logicalOperators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /* 
        System.out.print("Enter a temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Is it sunny outside?(true/false) ");
        boolean isSunny = sc.nextBoolean();

        /*while(temp <= 0 || temp >= 100){
            System.out.print("Please enter a valid temp (0 - 100): ");
            temp = sc.nextDouble();
        }
        System.out.println("Temp is: " + temp);
        
        if(temp >= 0 && temp <= 30 && isSunny){
            System.out.println("The weather is nice");
        }
        else if(temp >= 0 && temp <= 30 && !isSunny){
            System.out.println("The weather is not so nice");
        } 
        */
        // Username checker
        System.out.print("Enter you username: ");
        String userName = sc.nextLine();
        boolean marker = true;

        while(marker){
            if(userName.length() < 4 || userName.length() > 12){
                System.out.print("Username must be bigger than 4 and smaller than 12");
            }
            else if(userName.contains(" ") || userName.contains("_")){
                System.out.print("Username cannot contain any whitespace or _");
            }
            else{
                System.out.println("Username is: " + userName);
                marker = false;
            }
    }

        sc.close();

    }
}