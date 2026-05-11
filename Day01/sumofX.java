package Day01;
import java.util.Scanner;
public class sumofX {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    String n = input.next();
    int sum = 0;

    while(!n.equals("X")){
      sum = sum + Integer.parseInt(n);
      System.out.println("Enter the number:");
      n = input.next();
    }
    System.out.println(sum);
    input.close();
  }
  
}
