import java.util.Objects;

public class Mebel{
    private final String nazwa;
    private final double dlugosc, szerokosc;
    private final Integer iloscNog;
    private static int ile;

    public Mebel(String nazwa, double dlugosc, double szerokosc, Integer iloscNog){
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.iloscNog = iloscNog;
        ile++;
    }

    public Mebel(double dlugosc, double szerokosc, Integer iloscNog){
        this("Jakis Mebel", dlugosc, szerokosc, iloscNog);
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

    public String toString(){
        StringBuilder tekst = new StringBuilder();
        tekst.append(this.getClass().getName());
        if (!nazwa.equals("Jakis Mebel"))
            tekst.append(" ").append(this.nazwa).append(" ");
        tekst.append("[").append(this.dlugosc).append("], ");
        tekst.append("[").append(this.szerokosc).append("], ");
        tekst.append("[").append(this.iloscNog).append("]");
        return tekst.toString();
    }

    @Override public boolean equals(Object otherObject){
        Mebel other = (Mebel) otherObject;
        if (getClass() != otherObject.getClass())
            return false;
        return this.nazwa.equals(other.nazwa) && this.szerokosc == other.szerokosc
                && Objects.equals(this.iloscNog, other.iloscNog) && this.dlugosc == other.dlugosc;
    }

    public static int getIle() {
        return ile;
    }

}
