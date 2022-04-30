import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[] array = new int[5];

        Arrays.fill(array, 1);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 1, 4, 2);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 2, 3, 3);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 1, 4, 2);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 1);
        System.out.println(Arrays.toString(array));
    }
}
