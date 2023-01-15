public class Main {
    public static void main(String[] args){

        Mebel maly = new Mebel("Maly Mebel", 1, 0.5, 4); // 1.

        System.out.println(maly); // 2.

        System.out.println(Mebel.getIle()); // 3.

        Mebel sredni = new Mebel(1, 0.5, 4); // 4.

        System.out.println(sredni); // 5.

        Biurko maleBiurko = new Biurko("Male Biurko", 2, 1, 4, 22); // 6.

        maleBiurko.setDataProdukcji(2005, 2, 28); // 7.

        System.out.println(maleBiurko); // 8.

        System.out.println(Mebel.getIle()); // 9.

        Mebel[][] spis = new Mebel[2][2]; // 10.

        spis[0][0] = sredni; // 11.
        spis[0][1] = maly;
        spis[1][0] = maleBiurko;
        spis[1][1] = sredni;

        for (int i = 0; i < 2; i++) { // 12.
            for (int j = 0; j < 2; j++) {
                System.out.print(spis[i][j] + " ");
            }
            System.out.println();
        }

        String[] spisNazw = new String[4]; // 13.

        spisNazw[0] = sredni.getNazwa(); // 14.
        spisNazw[1] = maly.getNazwa();
        spisNazw[2] = maleBiurko.getNazwa();
        spisNazw[3] = sredni.getNazwa();

        System.out.println(); // 15.
        for (String x : spisNazw) {
            System.out.println(x);
        }
        System.out.println();//************************************************

        System.out.println(sredni.equals(maly));// 16.
        System.out.println(sredni.equals(maleBiurko));

        int suma = 0; // 17.
        for (Mebel[] meble : spis) {
            for (Mebel mebel : meble) {
                if (mebel instanceof Biurko) {
                    suma++;
                }
            }
        }
        System.out.println();//************************************************

        System.out.println("Liczba biurek w tablicy spis: " + suma);

        System.out.println();//************************************************

        for (Mebel[] meble : spis) {  //18.
            for (Mebel mebel : meble) {
                System.out.print(mebel.getClass().getName() + ", ");
            }
        }

        System.out.println();//************************************************
    }
}