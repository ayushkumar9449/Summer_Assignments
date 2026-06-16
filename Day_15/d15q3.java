public class RightRotateByK {
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; 

        rightRotate(arr, k);

        System.out.print("Array after right rotation by " + k + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
