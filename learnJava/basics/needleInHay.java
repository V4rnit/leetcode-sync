import java.util.Scanner;
public class needleInHay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the Haystack String: ");
        String hay = sc.nextLine();

        System.out.print("Please enter the Needle String: ");
        String needle = sc.nextLine();

        int i = 0;
        int j = 0;
        int count = 0;

        while(i < hay.length() && j < needle.length()){
            if(hay.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                count++;
            }
            else{
                j = 0;
                count = 0;
            }
        }
        int startIndex = (count != 0) ? (i - count) : -1;
        System.out.println("The starting index of the needle string is: " + startIndex);

        
        sc.close();
    }
}
