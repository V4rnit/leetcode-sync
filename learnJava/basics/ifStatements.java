import java.util.Scanner;

public class ifStatements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = sc.nextBoolean();
        sc.nextLine(); 

        System.out.print("Please enter in your name: ");
        String name = sc.nextLine();

        System.out.print("Please input your age: ");
        int age = sc.nextInt();
        //GROUP 1 Validating name
        if(name.isEmpty()){
            System.out.println("You did not input a name");
        }
        else{
            System.out.println("Your name is: " + name + "!");
        }
        //GROUP 2 Validatin age
        if(age >= 65){
            System.out.println("You are an OG");
        }
        else if(age >= 18){
            System.out.println("You are an adult");
        }
        else if(age < 0){
            System.out.println("You need to born first LIL BRO");
        }
        else if(age == 0){
            System.out.println("You were just born");
        }
        else{
            System.out.println("You are not an adult");
        }
        
        //GROUP 3 Validating if student or not
        if(isStudent){
            System.out.println("You are indeed a student");
        }
        else{
            System.out.println("You are not a student");
        }


        sc.close();
    }
}
