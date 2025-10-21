import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();

        int[] a1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] a2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] a3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] a4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(a1) + " + " + Arrays.toString(a2) + " = " + Arrays.toString(ex3.add(a1, a2)));
        System.out.println(Arrays.toString(a3) + " - " + Arrays.toString(a4) + " = " + Arrays.toString(ex3.subtract(a3, a4)));
    }
}
