import java.util.Scanner;

public class LeftRotateUserInput {
    // Function to rotate array left by k positions
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle cases where k > n

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations (k): ");
        int k = sc.nextInt();

        leftRotate(arr, k);

        System.out.print("Array after left rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
