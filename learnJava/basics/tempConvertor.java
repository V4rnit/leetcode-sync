import java.util.Scanner;

public class tempConvertor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Convert the Celsius or Fahrenheit? (C or F): ");
        char convert = sc.next().charAt(0);

        if(convert == 'C'){
   // Convert from Fahrenheit to Celsius
   double celsiusTemp = (temperature - 32) * 5/9;
   System.out.println("The temperature in Celsius is: " + celsiusTemp);
    } else if(convert == 'F') {
   // Convert from Celsius to Fahrenheit
   double fahrenheitTemp = (temperature * 9/5) + 32;
   System.out.println("The temperature in Fahrenheit is: " + fahrenheitTemp);
    } else {
   System.out.println("Invalid input. Please enter C or F.");
    }


        sc.close();
    }
}