import java.util.Scanner;
public class Fibo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = input.nextInt();

    int a = 0 ;
    int b = 1;

    for (int i =1; i<=n; i++){
      int temp = a + b;
      a = b;
      b = temp;
      System.out.print(a + " ");
    }
    input.close();
  }
}
