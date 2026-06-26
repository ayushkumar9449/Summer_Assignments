import java.util.*;

class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names separated by space:");
        String[] names = sc.nextLine().split("\\s+");

        Arrays.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
