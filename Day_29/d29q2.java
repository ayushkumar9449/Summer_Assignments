import java.util.*;

class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        while (true) {
            System.out.println("\n1. Display\n2. Find Max\n3. Find Min\n4. Sort\n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(Arrays.toString(arr));
                    break;
                case 2:
                    System.out.println("Max: " + Arrays.stream(arr).max().getAsInt());
                    break;
                case 3:
                    System.out.println("Min: " + Arrays.stream(arr).min().getAsInt());
                    break;
                case 4:
                    Arrays.sort(arr);
                    System.out.println("Sorted: " + Arrays.toString(arr));
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
