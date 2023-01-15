import java.util.Objects;

public class Mebel {
    private final String nazwa;
    private final double dlugosc, szerokosc;
    private final Integer iloscNog;
    private static int ile;

    public Mebel(String nazwa, double dlugosc, double szerokosc, Integer iloscNog) {
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.iloscNog = iloscNog;
        ile++;
    }

    public Mebel(double dlugosc, double szerokosc, Integer iloscNog) {
        this.nazwa = "Jakis Mebel";
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.iloscNog = iloscNog;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public Integer getIloscNog() {
        return iloscNog;
    }

    @Override
    public String toString(){
        if (nazwa.equals("Jakis Mebel")){
            return this.getClass().getName() + " | [" + this.dlugosc + "], ["
                    + this.szerokosc + "], [" + this.iloscNog + "]";}
        return this.getClass().getName() + " | " + this.nazwa + " ["
                + this.dlugosc + "], ["
                + this.szerokosc + "], [" + this.iloscNog + "] ";

    }
    @Override
    public boolean equals(Object otherObj){
        Mebel other = (Mebel) otherObj;
        if(this == other)
            return true;
        if(this.getClass() != otherObj.getClass())
            return false;
        return this.getNazwa().equals(other.getNazwa()) && this.getSzerokosc() == other.getSzerokosc()
                && Objects.equals(this.getIloscNog(), other.getIloscNog()) && this.getDlugosc() == other.getDlugosc();
    }

    public static int getIle() {
        return ile;
    }
}
