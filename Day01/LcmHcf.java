package Day01;
import java.util.Scanner;
public class LcmHcf{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int a = input.nextInt();

    System.out.println("Enter the second number:");
    int b = input.nextInt();

    int hcf = 1;
    for(int  i = 1; i<=a && i<=b; i++){
      if(a%i==0 && b%i==0){
        hcf = i;
      }
    }
    System.out.println("HCF is :  "+hcf);
    int LCM = ((a*b)/hcf);
    System.out.println("LCM is :  "+LCM);
    input.close();
  }
}
