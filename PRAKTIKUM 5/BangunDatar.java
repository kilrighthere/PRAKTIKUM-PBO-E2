// package PRAKTIKUM4;

/* Nama file    : BangunDatar.java
* Deskripsi    : Program untuk Kelas BangunDatar
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 23 Maret 2025
*/

public abstract class BangunDatar {
    // setelah di deklarasikan sebagai kelas abstract, tidak apa jika tidak memiliki metode abstract
// public final class BangunDatar {
    // keyword final menandai bahwa kelas ini tidak dapat diwariskan ke kelas lain
    // private int jmlSisi;
    // private String warna;
    // private String border;
    // private static int counterBangunDatar = 0;

    // METHODE
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;
    // protected bisa diakses oleh subclass dan kelas pada package yang sama

    // KONSTRUKTOR
    protected BangunDatar(){
        counterBangunDatar++;
    }

    protected BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // ABSTRACT METHODE
    public abstract double getLuas(); 
    public abstract double getKeliling();   

    // GETTER DAN SETTER
    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    // METHOD LAINNYA
    // prosedure untuk menampilkan info objek bangun datar
    public void printInfo(){
        System.out.println("Jumlah sisi : "+jmlSisi);
        System.out.println("Warna : "+warna);
        System.out.println("Border : "+border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar : " + counterBangunDatar);        
    }//static method tidak bisa di override karena merupakan methode milik kelas bukan objek


    // fungsi untuk membandingkan luas objek bangun datar apakah sama atau tidak
    public boolean isEqualLuas(BangunDatar x){
        return this.getLuas()==x.getLuas();
    }

    // fungsi untuk membandingkan keliling objek bangun datar apakah sama atau tidak
    public boolean isEqualKeliling(BangunDatar x){
        return this.getKeliling()==x.getKeliling();
    }
}


