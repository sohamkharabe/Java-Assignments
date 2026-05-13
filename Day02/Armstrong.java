import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();

        for(int num = start; num <= end; num++) {

            int original = num;
            int temp = num;
            int sum = 0;

            int digits = String.valueOf(num).length();

            while(temp > 0) {

                int rem = temp % 10;

                sum += Math.pow(rem, digits);

                temp = temp / 10;
            }

            if(sum == original) {
                System.out.println(original);
            }
        }

        input.close();
    }
}