/* Nama File    : Mgaris.java */
/* Deskripsi    : berisi Main program class garis*/
/* Pembuat      : Shakila Tungga Dewi*/
/* Tanggal      : 23 Februari 2025*/

public class Mgaris {
    public static void main(String[] args) {
        // membuat objek baru G! dan G2
        garis G1 = new garis();
        garis G2 = new garis(1,2,5,7);

        // Menampilkan garis G1
        System.out.println(" titik awal dan akhir garis G1 : ");
        G1.printgaris();
        System.out.println();

        // Menampilkan garis G2
        System.out.println(" titik awal dan akhir garis G2 : ");
        G2.printgaris();

        System.out.println();
        // Menampilkan titik awal garis G2
        System.out.println("titik awal G2 adalah : "+(G2.getTitikAwal()));

        // Menampilkan titik akhir garis G2
        System.out.println("titik akhir  G2 adalah : "+(G2.getTitikAkhir()));

        // Menampilkan nilai counter garis 
        System.out.println();
        System.out.println("jumlah garis sekarang adalah : "+(garis.getCounterGaris()));

        // Mengeset nilai titik awal untuk garis G1
        G1.SetTitikAwal(3,4);
        System.out.println("menampilkan garis G1 setelah dilakukan set titik awal");
        G1.printgaris();

        // Mengeset nilai titik akhir untuk gari G1
        G1.SetTitikAkhir(7, 11);
        System.out.println("menampilkan garis G1 setelah dilakukan set titik akhir");
        G1.printgaris();

        // menampilkan penjang garis G2
        System.out.println("panjang garis G2 : "+G2.panjangGaris());

        // Menampilkan gradien garis G2
        System.out.println("gradien garis G2 : "+G2.gradienGaris());

        // menampilkan titik tengah/midpoint dari garis G2
        System.out.println("midpoint garis G2 : "+G2.getmidPoint());

        // Menampilkan titik awal dari garis G2
        System.out.print("Titik awal dari garis G2 : ");
        G2.printTitikAwal();

        // Menampilkan titik akhir dari garis G2
        System.out.print("Titik akhir dari garis G2 : ");
        G2.printTitikAkhir();

        // Menampilkan persamaan garis dari G2
        System.out.print("persamaan garis dari G2 : ");
        G2.persamaangaris();
    }
}
