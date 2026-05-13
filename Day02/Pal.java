import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();

        String rev = "";

        for(int i = a.length() - 1; i >= 0; i--) {

            rev = rev + a.charAt(i);
        }

        System.out.println(rev);

        if(a.equals(rev)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

        input.close();
    }
}