// package PRAKTIKUM_6.Anabul;
/* 
 * Nama File    : Anjing.java
 * Deskripsi    : Super Class Representasi anjing
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 26 April 2025
 */
public class Anjing extends Anabul{
    // atribut
    private String gerak = "melata";
    private String bunyi = "guk-guk";

    // konstruktor
    public Anjing(String nama){
        super(nama);
    }

    // method

    @Override
    // methode untuk menampilkan gerak dari objek anjing
    public String Gerak() {
        return this.gerak;
    }
    
    // methode untuk menampilkan suara dari objek anjing
    @Override
    public String Bersuara() {
        return this.bunyi;
    }
    
    @Override
    // methode untuk menampilkan info lengkap dari objek anjing
    public void infoAnabul() {
        System.out.println(this.getClass().getSimpleName());
        super.infoAnabul();
        System.out.println("Gerak   : "+Gerak());
        System.out.println("Bunyi   : "+Bersuara());

    }
}
