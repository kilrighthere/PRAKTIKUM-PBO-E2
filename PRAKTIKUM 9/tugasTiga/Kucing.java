// package PRAKTIKUM_6.Anabul;
/* 
 * Nama File    : Kucing.java
 * Deskripsi    : Super Class Representasi Kucing
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 26 April 2025
 */public class Kucing extends Anabul{
    // atribut
    private String gerak = "melata";
    private String bunyi = "meong";

    // konstruktor
    public Kucing(String nama){
        super(nama);
    }

    // Method
    // methode untuk menampilkan gerak dari objek kucing
    @Override
    public String Gerak() {
        return this.gerak;
    }

    // methode untuk menampilkan suara dari objek Kucing
    @Override
    public String Bersuara() {
        return this.bunyi;
    }

    @Override
    // methode untuk menampilkan info lengkap dari objek kucing
    public void infoAnabul() {
        System.out.println(this.getClass().getSimpleName());
        super.infoAnabul();
        System.out.println("Gerak   : "+ Gerak());
        System.out.println("Bunyi   : "+Bersuara());
    }
}
