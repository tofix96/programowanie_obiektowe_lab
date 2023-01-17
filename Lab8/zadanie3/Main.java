class NieprawidlowyAdresException extends Exception {
    public NieprawidlowyAdresException(String message) {
        super(message);
    }
}

class Adres {
    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        String errorMessage = "";
        if (ulica == null) {
            errorMessage += "Ulica nie może być nullem. ";
        }
        if (numerDomu <= 0) {
            errorMessage += "Numer domu musi być liczbą dodatnią. ";
        }
        if (kodPocztowy == null) {
            errorMessage += "Kod pocztowy nie może być nullem. ";
        }
        if (miasto == null) {
            errorMessage += "Miasto nie może być nullem.";
        }
        if (!errorMessage.isEmpty()) {
            throw new NieprawidlowyAdresException(errorMessage);
        }
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Adres adres = new Adres(null, 0, null, null);
            System.out.println("Ulica: " + adres.getUlica());
            System.out.println("Numer domu: " + adres.getNumerDomu());
            System.out.println("Kod pocztowy: " + adres.getKodPocztowy());
            System.out.println("Miasto: " + adres.getMiasto());
        } catch (NieprawidlowyAdresException e) {
            System.out.println(e.getMessage());
        }
    }
}