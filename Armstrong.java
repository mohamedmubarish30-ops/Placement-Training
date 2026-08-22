import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        int digits = 0;

        int temp = n;

        // Count number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;

        // Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        // Check Armstrong number
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }

        sc.close();
    }
}