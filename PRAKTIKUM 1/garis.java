/* Nama File    : garis.java */
/* Deskripsi    : berisi atribut dan methode class garis*/
/* Pembuat      : Shakila Tungga Dewi*/
/* Tanggal      : 23 Februari 2025*/

public class garis {
    /* ATRIBUT */
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;    

    /* KONSTRUKTOR */
    garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    garis(double x1, double y1, double x2, double y2){
        titikAwal = new Titik(x1,y1);
        titikAkhir = new Titik(x2, y2);
        counterGaris++;
    }

    // Mencetak koordinat garis
    void printgaris(){
        titikAwal.printTitik();
        titikAkhir.printTitik();
    }

    /* SELEKTOR */
    // mengembalikan nilai titik awal
    Titik getTitikAwal(){
        return titikAwal;
    }

    // mengembalikan nilai titik akhir
    Titik getTitikAkhir(){
        return titikAkhir;
    }

    // mengembalikan nilai counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    /* SETTER */
    // Mengeset nilai titik awal
    void SetTitikAwal(double x, double y){
        titikAwal = new Titik(x,y);
    }

    // mengeset nilai dari titik akhir
    void SetTitikAkhir(double x, double y){
        titikAkhir = new Titik(x,y);
    }

    // mengembalikan panjang sebuah garis
    double panjangGaris(){
        return titikAwal.getJarak(titikAkhir);
    }

    // mengembalikan gradie garis
    double gradienGaris(){
        return ((titikAkhir.getAbsis()-titikAwal.getAbsis())/(titikAkhir.getOrdinat()-titikAwal.getOrdinat()));
    }

    // menghitung titik tengah suatu garis
    Titik getmidPoint(){
        double x = (titikAwal.absis + titikAkhir.absis)/2;
        double y = (titikAwal.ordinat + titikAkhir.ordinat)/2;
        return new Titik(x,y);
    }

    //mengecek apakah garis sejajar dengan garis lain
    boolean IsSejajar(garis T){
        double m1 = (titikAkhir.getAbsis()-titikAwal.getAbsis())/(titikAkhir.getOrdinat()-titikAwal.getOrdinat());
        double m2 = (T.titikAkhir.getAbsis()-T.titikAwal.getAbsis())/(T.titikAkhir.getOrdinat()-T.titikAwal.getOrdinat());
        if (m1 == m2) {
            return true;
        }
        else{
            return false;
        }
    }
    boolean Istegaklurus(garis T){
        double m1 = (titikAkhir.getAbsis()-titikAwal.getAbsis())/(titikAkhir.getOrdinat()-titikAwal.getOrdinat());
        double m2 = (T.titikAkhir.getAbsis()-T.titikAwal.getAbsis())/(T.titikAkhir.getOrdinat()-T.titikAwal.getOrdinat());
        if (m1 * m2==-1) {
            return true;
        }
        else{
            return false;
        }
    }

    void printTitikAwal(){
        System.out.println(titikAwal);
    }

    void printTitikAkhir(){
        System.out.println(titikAkhir);
    }

    void persamaangaris(){
        double m = (titikAkhir.getAbsis()-titikAwal.getAbsis())/(titikAkhir.getOrdinat()-titikAwal.getOrdinat());
        double c = titikAwal.getOrdinat()/(m * titikAwal.getAbsis());
        System.out.println("y = "+ m+"x + "+ c);
    }


}
