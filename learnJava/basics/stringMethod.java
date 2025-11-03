import java.util.Scanner;

public class stringMethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to find the length of it: ");
        String name = sc.nextLine();

        System.out.println("Enter the character position you would like to find: ");
        int charPos = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter a letter you would like to find the first occurence of: ");
        char first = sc.nextLine().charAt(0);
        int firstPos = name.indexOf(first);

        System.out.println("Enter a letter you would like to find the last occurence of: ");
        char last = sc.nextLine().charAt(0);
        int lastPos = name.indexOf(last);

        int len = name.length();
        char charAt = name.charAt(charPos);

        System.out.println("The lenght of " + name + " is: " + len);
        System.out.println("The character at position " + charPos + " is: " + charAt);
        System.out.println("The first occurrence of '" + first + "' is at index: " + firstPos);
        System.out.println("The last occurrence of '" + last + "' is at index: " + lastPos);

        sc.close();
    }
}
