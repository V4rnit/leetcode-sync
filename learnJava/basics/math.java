import java.util.Scanner;
public class math {
    public static void main(String args[]){
        //Find the HYPOTENUSE c = a^2 + b^2
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the a: ");
        double a = sc.nextDouble();

        System.out.print("Please enter the B: ");
        double b = sc.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.printf("The HYPOTENUSE is: %.2f cm \n", c);

        /*circumfrence = 2 * PI * radius
         * area = PI * radius ^ 2 
         * volume = (4/3) * PI * radius^3
         */
        System.out.print("Please enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double circumfrence = 2 * Math.PI * radius;
        System.out.printf("The circumfrence of this circle is %.2f \n", circumfrence);

        double area = Math.PI * Math.pow(radius,2);
        System.out.printf("The area of this circle is: %.2f \n", area);

        sc.close();

    }
    
}
