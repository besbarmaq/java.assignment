import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        printNumbers(a,b);
    }
    public static void printNumbers(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
            return;
        } else if (a < b) {
            System.out.println(a );
            printNumbers(a + 1, b);
        } else {
            System.out.println(a);
            printNumbers(a - 1, b);
        }
    }
}

