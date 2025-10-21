public class Ex3 {
    public int[] add(int[] a, int[] b) {
        if  (a.length != b.length) {
            throw new IllegalArgumentException("The numbers must be the same length");
        }

        int carry = 0;
        int[] result = new int[a.length + 1];
        for (int i = a.length - 1, j = result.length - 1; i >= 0; i--, j--) {
            int sum = a[i] + b[i] + carry;
            result[j] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        if (result[0] == 0){
            int[] temp = new int[a.length];
            System.arraycopy(result, 1, temp, 0, a.length);
            return temp;
        } else {
            return result;
        }
    }

    public  int[] subtract(int[] a, int[] b) {
        if  (a.length != b.length) {
            throw new IllegalArgumentException("The numbers must be the same length");
        }

        int[] result = new int[a.length];
        int borrow = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int diff = a[i] - b[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }
}
