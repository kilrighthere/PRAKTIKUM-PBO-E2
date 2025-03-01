package ENKAPSULASI;
/* Nama File    : garis.java */
/* Deskripsi    : berisi atribut dan methode class garis*/
/* Pembuat      : Shakila Tungga Dewi*/
/* Tanggal      : 27 Februari 2025*/

public class garis {
    /* ATRIBUT */
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;    

    /* KONSTRUKTOR */
    public garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    public garis(double x1, double y1, double x2, double y2){
        titikAwal = new Titik(x1,y1);
        titikAkhir = new Titik(x2, y2);
        counterGaris++;
    }

    // Mencetak koordinat garis
    public void printgaris(){
        titikAwal.printTitik();
        titikAkhir.printTitik();
    }

    /* SELEKTOR */
    // mengembalikan nilai titik awal
    public Titik getTitikAwal(){
        return titikAwal;
    }

    // mengembalikan nilai titik akhir
    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    // mengembalikan nilai counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    /* SETTER */
    // Mengeset nilai titik awal
    public void SetTitikAwal(double x, double y){
        titikAwal = new Titik(x,y);
    }

    // mengeset nilai dari titik akhir
    public void SetTitikAkhir(double x, double y){
        titikAkhir = new Titik(x,y);
    }

    // mengembalikan panjang sebuah garis
    public double panjangGaris(){
        return titikAwal.getJarak(titikAkhir);
    }

    // mengembalikan gradie garis
    public double gradienGaris(){
        return ((titikAkhir.getAbsis()-titikAwal.getAbsis())/(titikAkhir.getOrdinat()-titikAwal.getOrdinat()));
    }

    // menghitung titik tengah suatu garis
    public Titik getmidPoint(){
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis())/2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2;
        return new Titik(x,y);
    }

    //mengecek apakah garis sejajar dengan garis lain
    public boolean IsSejajar(garis T){
        double m1 = (titikAkhir.getAbsis()-titikAwal.getAbsis())/(titikAkhir.getOrdinat()-titikAwal.getOrdinat());
        double m2 = (T.titikAkhir.getAbsis()-T.titikAwal.getAbsis())/(T.titikAkhir.getOrdinat()-T.titikAwal.getOrdinat());
        if (m1 == m2) {
            return true;
        }
        else{
            return false;
        }
    }

    // mengecek apakah suatu garis tegak lurus dengan garis lain
    public boolean Istegaklurus(garis T){
        double m1 = (titikAkhir.getAbsis()-titikAwal.getAbsis())/(titikAkhir.getOrdinat()-titikAwal.getOrdinat());
        double m2 = (T.titikAkhir.getAbsis()-T.titikAwal.getAbsis())/(T.titikAkhir.getOrdinat()-T.titikAwal.getOrdinat());
        if (m1 * m2==-1) {
            return true;
        }
        else{
            return false;
        }
    }

    // menampilkan koordinat titik awal dari garis ke layar
    public void printTitikAwal(){
        System.out.println(titikAwal);
    }

    // menampilkan koordinat titik akhir ke layar
    public void printTitikAkhir(){
        System.out.println(titikAkhir);
    }

    // menampilkan persamaan dari sebuah garis dengan format y = mx +c
    public void persamaangaris(){
        double m = (titikAkhir.getAbsis()-titikAwal.getAbsis())/(titikAkhir.getOrdinat()-titikAwal.getOrdinat());
        double c = titikAwal.getOrdinat()/(m * titikAwal.getAbsis());
        System.out.println("y = "+ m+"x + "+ c);
    }


}
