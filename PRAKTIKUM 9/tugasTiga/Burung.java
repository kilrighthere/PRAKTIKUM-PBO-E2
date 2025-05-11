// package PRAKTIKUM_6.Anabul;
/* 
 * Nama File    : Burung.java
 * Deskripsi    : Super Class Representasi Burung
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 26 April 2025
 */public class Burung extends Anabul{
    // atribut
    private String gerak = "terbang";
    private String bunyi = "cuit";

    // konstruktor
    public Burung(String nama){
        super(nama);
    }

    // Method
    @Override
    // methode untuk menampilkan gerak dari objek Burung
    public String Gerak() {
        return this.gerak;
    }

    @Override
    // methode untuk menampilkan suara dari objek Burung
    public String Bersuara() {
        return this.bunyi;
    }

    @Override
    // methode untuk menampilkan info lengkap dari objek Burung
    public void infoAnabul() {
        System.out.println(this.getClass().getSimpleName());
        super.infoAnabul();
        System.out.println("Gerak   : "+Gerak());
        System.out.println("Bunyi   : "+Bersuara());
    }
}

