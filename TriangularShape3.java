public class TriangularShape3 {
    public static void main(String[] args) {
        // Outer loop controls the number of lines in the inverted triangle
        for (int i = 10; i >= 1; i--) {
            // Inner loop controls the number of "X" characters on each line
            for (int j = 1; j <= i; j++) {
                System.out.print("X" + " ");
            }
            // Move to the next line after finishing the inner loop
            System.out.println();
        }
    }
}
