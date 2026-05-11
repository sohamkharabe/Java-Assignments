package Day01;
import java.util.Scanner;
public class Sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Values");
    int a = input.nextInt();
    int b = input.nextInt();
    int sum = a + b;
  System.out.println("Sum is: "+sum);
  input.close();
}
}
