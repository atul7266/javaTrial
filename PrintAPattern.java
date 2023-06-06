public class PrintAPattern {
    public static void main(String[] args) {
        int size = 5; // Change the value of size to adjust the size of the 'A' pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" "); // Print spaces before the 'A'
            }
            for (int k = 0; k <= i * 2; k++) {
                if (k == 0 || k == i * 2) {
                    System.out.print("*"); // Print '*' at the beginning and end of each row
                } else if (i == size / 2 && k % 2 == 1) {
                    System.out.print("*"); // Print '*' in the middle row
                } else {
                    System.out.print(" "); // Print spaces inside the 'A'
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
