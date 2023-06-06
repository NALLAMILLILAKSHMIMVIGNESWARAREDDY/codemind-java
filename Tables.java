import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int R = scanner.nextInt();
        
        for (int i = 1; i <= R; i++) {
            if (i % 2 != 0) {
                int result = N * i;
                System.out.println(N + " x " + i + " = " + result);
            }
        }
        
        scanner.close();
    }
}
