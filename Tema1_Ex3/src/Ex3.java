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

    public  int[] multiply(int[] a, int digit) {
        if (digit < 0 || digit > 9) {
            throw new IllegalArgumentException("The multiplier must be a single digit");
        }

        int[] result = new int[a.length + 1];
        int carry = 0;
        for (int i = a.length - 1, j = a.length; i >= 0; i--, j--) {
            int prod = a[i] * digit + carry;
            result[j] = prod % 10;
            carry = prod / 10;
        }

        result[0] = carry;

        if (result[0] == 0) {
            int[] temp = new int[a.length];
            System.arraycopy(result, 1, temp, 0, a.length);
            return temp;
        } else {
            return result;
        }
    }

    public  int[] divide(int[] a, int digit) {
        if (digit < 0 || digit > 9) {
            throw new IllegalArgumentException("The multiplier must be a single digit");
        }

        int[] quotient = new int[a.length];
        int remainder = 0;
        for (int i = 0; i < a.length; i++) {
            int cur = remainder * 10 + a[i];
            int q = cur / digit;
            remainder = cur % digit;
            quotient[i] = q;
        }
        return quotient;
    }
}
