public class array8 {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 }; // You can replace these values with your own array

        System.out.println("Printing the entire array:");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after the array is printed
    }
}
