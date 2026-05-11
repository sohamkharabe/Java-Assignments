import java.util.Scanner;
public class Mul {
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    System.out.println("Enter Values");
    int a = Input.nextInt();
    int i = 1;
    while(i<=10){
      int mul = a * i;
      System.out.println(a+" * "+i+" = "+mul);
      i++;
    }
    
  }
  
}
