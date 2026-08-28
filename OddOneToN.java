import java.util.Scanner;

class OddOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        System.out.println("Odd numbers from 1 to " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                System.out.println(i);
            sc.close();
        }
    }
}