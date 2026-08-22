import java.util.Scanner;

class Lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int lastDigit = n % 10;

        System.out.println("Last digit is: " + lastDigit);
        sc.close();
    }
}
