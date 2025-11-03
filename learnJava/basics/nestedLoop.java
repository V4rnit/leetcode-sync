import java.util.Scanner;

public class nestedLoop{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        /*for(int i = 0; i < 4; i++){
            for(int j = 0; j <=i; j++){
                System.out.print(j);
                
            }
            System.out.println();
        }
        */
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        System.out.print("Enter the symbol: ");
        char symbol = sc.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}