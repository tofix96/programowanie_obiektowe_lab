public class prostokat {
    double szer,wys;

    public prostokat(double szer, double wys) {
        this.szer = szer;
        this.wys = wys;
    }
    //metody
    public double Pole()
    {
        return wys*szer;
    }
    public double Obwod()
    {
        return 2*wys+2*szer;
    }
    public double Przekatna()
    {
        return Math.sqrt(Math.pow(wys,2)+(Math.pow(szer,2)));
    }
    public void Opis()
    {
        System.out.println("Prostokat o boku a="+wys+" i boku b="+szer+ " ma "+
                "pole prostokata: "+Pole()+"\nobwod prostokata: "+Obwod()+""+"\ndlugosc przekatnej: "+Przekatna());
    }

}



