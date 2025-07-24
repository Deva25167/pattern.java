public class diamond {
    public static void main(String[] args) {
        int n = 6;

        // Upper part of the heart
        for (int i = n / 2; i <= n; i += 2) {
            // Left spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower inverted triangle part
        for (int i = n; i >= 1; i--) {
            // Left spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
