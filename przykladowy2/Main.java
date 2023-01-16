public class Main {
    public static void main(String[] args){
        // 1
        Mebel maly = new Mebel("Maly Mebel", 1, 0.5, 4);

        // 2
        System.out.println(maly);
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************

        // 3
        System.out.println("ile razy wywolany konstruktor " + Mebel.class.getName() + " = " + Mebel.getIle());
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************

        // 4
        Mebel sredni = new Mebel(1, 0.5, 4);

        // 5
        System.out.println(sredni);
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************

        // 6
        Biurko maleBiurko = new Biurko("Male Biurko", 2, 1, 4, 22);

        // 7
        maleBiurko.setDataProdukcji(2005, 2, 28);

        // 8
        System.out.println(maleBiurko);
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************

        // 9
        System.out.println("ile razy wywolany konstruktor " + Mebel.class.getName() + " = " + Mebel.getIle());
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************

        // 10
        Mebel[][] spis = new Mebel[2][2];

        // 11
        spis[0][0] = sredni;
        spis[0][1] = maly;
        spis[1][0] = maleBiurko;
        spis[1][1] = sredni;

        // 12
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(spis[i][j] + " ");
            }
            System.out.println();
        }

        // 13
        String[] spisNazw = new String[4];

        // 14
        spisNazw[0] = sredni.getNazwa();
        spisNazw[1] = maly.getNazwa();
        spisNazw[2] = maleBiurko.getNazwa();
        spisNazw[3] = sredni.getNazwa();

        // 15
        System.out.println();
        for (String x : spisNazw) {
            System.out.print(x + ", ");
        }
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************

        // 16
        System.out.println("Czy średni i maly takie same? " + sredni.equals(maly));

        System.out.println("Czy średni i maleBiurko takie same? " + sredni.equals(maleBiurko));
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************

        //17
        int suma = 0;
        for (Mebel[] meble : spis) {
            for (Mebel mebel : meble) {
                if (mebel instanceof Biurko) {
                    suma++;
                }
            }
        }
        System.out.println("Liczba biurek w tablicy spis: " + suma);
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************

        // 18
        for (Mebel[] meble : spis) {
            for (Mebel mebel : meble) {
                System.out.print(mebel.getClass().getName() + ", ");
            }
        }
        System.out.println(); // ********************* ADDITIONAL NEW LINE *********************
    }
}