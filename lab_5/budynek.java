import java.time.*;
import java.time.temporal.ChronoUnit;

public class budynek {
    String nazwa;
    int lpPieter;
    // final int rokConst=1999;
    LocalDate rokBudowy;

    public budynek(String nazwa, int lpPieter, LocalDate rokBudowy) {
        this.nazwa = nazwa;
        this.lpPieter = lpPieter;
        this.rokBudowy = rokBudowy;
    }

    @Override
    public String toString() {
        return "budynek{" +
                "nazwa='" + nazwa + '\'' +
                ", lpPieter=" + lpPieter +
                ", rokBudowy=" + rokBudowy +
                '}';
    }
    public long ilelat(){
        LocalDate today = LocalDate.now();
        long ilelat = ChronoUnit.YEARS.between(rokBudowy,today);
        return ilelat;

    }

}
