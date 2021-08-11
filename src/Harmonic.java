import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
            // INITIALIZATION
            double result = 0, num = 0, j;
            int n;
            // INPUT DATA
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the harmonic you want to find: ");
            n = sc.nextInt();

            // COMPUTATION
            for (j = 1; j <= n; j++) {
                num = num + (1 / j);
                result = num;
            }
            System.out.println("the value of harmonic no. is: " + result);
    }
}
