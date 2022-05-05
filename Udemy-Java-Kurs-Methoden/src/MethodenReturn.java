public class MethodenReturn {
    public static void main(String[] args) {
        int sum = taschenRechner(4, 3, '-');
        System.out.println(sum);

    }

    public static int taschenRechner(int zahl1, int zahl2, char operator) {
        int sum; // lokale variable
        if (operator == '+') {
            sum = zahl1 + zahl2;
        } else {
            sum = zahl1 - zahl2;
        }
            return sum;

    }
}
