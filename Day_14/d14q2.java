import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Boolean array to mark visited elements
        boolean[] visited = new boolean[n];

        System.out.println("Frequency of each element:");
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; // Skip already counted elements

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // Mark duplicate as visited
                }
            }
            System.out.println(arr[i] + " → " + count);
        }
    }
}
