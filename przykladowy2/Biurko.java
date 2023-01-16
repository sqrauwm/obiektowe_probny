import java.time.LocalDate;

public class Biurko extends Mebel{
    private LocalDate dataProdukcji;
    private final double przekatnaMonitora;
    public Biurko(String nazwa, double dlugosc, double szerokosc, Integer iloscNog, double przekatnaMonitora) {
        super(nazwa, dlugosc, szerokosc, iloscNog);
        this.dataProdukcji = LocalDate.now();
        this.przekatnaMonitora = przekatnaMonitora;
    }
    public void setDataProdukcji(int rok, int miesiac, int dzien) {
        this.dataProdukcji = LocalDate.of(rok, miesiac, dzien);
    }
    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }
    @Override
    public String toString() {
        return super.toString()
                + "[" + this.dataProdukcji + "] ["
                + this.dataProdukcji.getDayOfWeek() + "] ["
                + this.dataProdukcji.getDayOfYear() + "] ";
    }
    @Override
    public boolean equals(Object otherObj) {
        Biurko other = (Biurko) otherObj;

        return super.equals(otherObj)
                && this.przekatnaMonitora == other.przekatnaMonitora
                && this.getDataProdukcji().equals(other.getDataProdukcji());
    }
}