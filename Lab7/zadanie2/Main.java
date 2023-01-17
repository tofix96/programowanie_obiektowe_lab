interface Pływanie {
    void płyn();
    void wynurz();
    void zanurz();
}

interface Latanie {
    void leć();
    void ląduj();
}

abstract class Zwierzę {
    protected String nazwa;
    protected String gatunek;

    public Zwierzę(String nazwa, String gatunek) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
    }

    public abstract void działanie();
}

abstract class Ryba extends Zwierzę implements Pływanie {
    public Ryba(String nazwa, String gatunek) {
        super(nazwa, gatunek);
    }

    public void jedz() {
        System.out.println(nazwa + " jest teraz pożywione.");
    }

    public void wydalaj() {
        System.out.println(nazwa + " wydala odpady.");
    }
}

class Wieloryb extends Ryba {
    public Wieloryb(String nazwa) {
        super(nazwa, "wieloryb");
    }

    @Override
    public void płyn() {
        System.out.println(nazwa + " pływa po oceanie.");
    }

    @Override
    public void wynurz() {
        System.out.println(nazwa + " wynurza się na powierzchnię.");
    }

    @Override
    public void zanurz() {
        System.out.println(nazwa + " zanurza się pod wodą.");
    }

    @Override
    public void działanie() {
        płyn();
        wynurz();
        jedz();
        zanurz();
        wydalaj();
    }
}

class Test {
    public static void main(String[] args) {
        Wieloryb wy = new Wieloryb("Edek");
        wy.działanie();
    }
}
