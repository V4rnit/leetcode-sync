import java.util.Scanner;
public class subString {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your email address: ");
        String email = sc.nextLine();
        
        if(email.contains("@")){
            System.out.println("Valid email");
        }
        else{
            System.out.println("Invalid email");
        }
        int len = email.length();
        
        System.out.println("Please enter the Starting (from 0) index of the substring you would like to view: ");
        int start = sc.nextInt();

        System.out.println("Please enter the Ending index of the substring ending at " + len + " :");
        int end = sc.nextInt();

        String subString = email.substring(start,end);

        System.out.println("The substring is: " + subString);
        sc.close();
        
    }
}
