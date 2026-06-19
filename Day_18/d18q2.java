public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1, 3};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("SORTED ARRAY THROUGH SELECTION SORT :");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
