import java.util.Scanner;
public class whileLoops {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        while(name.isEmpty()){
            System.out.print("Name cannot be empty: ");
            name = sc.nextLine();
        }
        System.out.println("Welcome " + name);
        sc.close();
    }
}
