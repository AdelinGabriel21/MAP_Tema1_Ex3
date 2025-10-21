import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] a2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        Ex3 ex3 = new Ex3();

        System.out.println(Arrays.toString(a1) + " + " + Arrays.toString(a2) + " = " + Arrays.toString(ex3.add(a1, a2)));
    }
}
