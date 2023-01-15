public class Main {
    public static void main(String[] args) {

        Mebel sredni = new Mebel("siemano",1, 0.5, 4);
        Mebel duzy = new Mebel(1, 0.5, 4);
        System.out.println(duzy.equals(sredni));
        System.out.println(Mebel.getIle());


        Biurko pierwsze = new Biurko("Biurko1",1, 0.5, 4, 22.7);
        pierwsze.setDataProdukcji(1939, 9, 1);
        System.out.println(pierwsze);



    }
}