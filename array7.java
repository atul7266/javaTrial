import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 }; // You can replace these values with your own array

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to find its index: ");
        int target = scanner.nextInt();

        int index = findElementIndex(array, target);

        if (index != -1) {
            System.out.println("The element " + target + " is found at index " + index);
        } else {
            System.out.println("The element " + target + " is not present in the array.");
        }
    }

    public static int findElementIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
