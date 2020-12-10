import java.util.Scanner;

public class ShowAShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");

        int choose = 0;
        int size = 5;

        while (choose!=4){
            System.out.print("Enter your choosing: ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    // Top-left
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j <= i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    // Top-right
                    for (int i = 0; i < size; i++) {
                        for (int j = 1; j < size-i ; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j <= i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    // Bottom-left
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < i ; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < size - i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    // Bottom-right
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size-i ; j++) {
                            System.out.print("* ");
                        }
                        for (int j = 0; j < i ; j++) {
                            System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size-i ; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < i*2 ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
