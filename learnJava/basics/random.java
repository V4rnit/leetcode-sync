import java.util.Random;
public class random{
    public static void main(String args[]){
        Random rng = new Random();
        int num1 = rng.nextInt(1,7);

        double num2 = rng.nextDouble();
        
        boolean isHead = rng.nextBoolean();

        if(isHead){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}