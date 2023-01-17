class BlednaWartoscDlaSilniException extends Exception {
    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }
}

class Silnia {
    public static int silnia(int n) throws BlednaWartoscDlaSilniException {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniException("Nie można obliczyć silni dla liczby ujemnej");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int silnia = Silnia.silnia(-5);
            System.out.println("Silnia: " + silnia);
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println(e.getMessage());
        }
    }
}