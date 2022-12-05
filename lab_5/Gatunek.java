public class Gatunek {
    public
    String n_r, n_g, opis;
    double l_ch2n, l_chx;

    public Gatunek(String n_r, String n_g, String opis, double l_ch2n, double l_chx) {
        this.n_r = n_r;
        this.n_g = n_g;
        this.opis = opis;
        this.l_ch2n = l_ch2n;
        this.l_chx = l_chx;
    }

    public void wypisz() {
        System.out.println("Gatunek{" + "nazwa_rodzaju='" + n_r + '\'' + ", nazwa_gatunku='" + n_g +
                ", opis='" + opis  + ", liczba chromosomów 2n=" + l_ch2n + ", liczba chromosomów x=" + l_chx + '}');
    }

    public String getimie() {
        return "Rodzaj i gatunek: " + n_r + " " + n_g;
    }

    public double getHaploid() {
        double result = l_chx / 2;
        return result;
    }

    public void cloneObj(Gatunek obj) {
        this.n_r = obj.n_r;
        this.n_g = obj.n_g;
        this.opis = obj.opis;
        this.l_ch2n = obj.l_ch2n;
        this.l_chx = obj.l_chx;
        System.out.println("Objekt został sklonowany");
    }


}