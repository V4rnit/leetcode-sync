import java.util.Scanner;
public class overloadMethods {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println(add(1,2));

        System.out.println(add(1,2,3));

        System.out.print("Enter the name of the pizza: ");
        String namePizza = sc.nextLine();

        System.out.print("Enter the name of the cheese: ");
        String nameCheese = sc.nextLine();

        System.out.println("Enter the name of the toppings: ");
        String top = sc.nextLine();
        System.out.println("The name of the pizza is: " + bakePizza(namePizza));

        System.out.println("The pizza is: " + bakePizza(namePizza, nameCheese));

        System.out.println("The whole pizza is: " + bakePizza(namePizza, nameCheese, top));
        sc.close();
   }
   static double add(int a, int b){
    return a + b;
   }
   //These function share the same name but have a different function signature as one takes 2 parameters
   //but the other one takes 3 parameters
   static double add(int a, int b, int c){
    return a + b + c;
   }
   //Below is an example of an overloaded method in java
   static String bakePizza(String pName){
    return pName + " Pizza";
   }
   static String bakePizza(String pName, String cName){
    return pName + " " + cName + " Pizza";
   }
   static String bakePizza(String pName,String cName, String toppings){
    return pName + " " + cName + " " + toppings + " Pizza";
   }
}
