import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int D = input.nextInt();
        int P = input.nextInt();

        double T = (double) D / P + 37;

        System.out.printf("%.3f", T);
    }
}
