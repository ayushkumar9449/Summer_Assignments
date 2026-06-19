import java.util.*;

public class UnionUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int x : arr1) {
            map.put(x, true);
        }

        for (int x : arr2) {
            map.put(x, true);
        }

        System.out.println("Union of arrays:");
        for (int key : map.keySet()) {
            System.out.print(key + " ");
        }
    }
}
