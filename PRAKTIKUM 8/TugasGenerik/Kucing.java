/* 
 * Nama File    : Kucing.java
 * Deskripsi    : Class Representasi kucing
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 26 April 2025
 */

package TugasGenerik;

public class Kucing extends Anabul{
    // atribut
    private String gerak = "melata";
    private String bunyi = "meong";

    // konstruktor
    public Kucing(String nama){
        super(nama);
    }

    // Method

    @Override
    public String Gerak() {
        return this.gerak;
    }

    @Override
    public String Bersuara() {
        return this.bunyi;
    }

    @Override
    public void infoAnabul() {
        System.out.println(this.getClass().getSimpleName());
        super.infoAnabul();
        System.out.println("Gerak   : "+ Gerak());
        System.out.println("Bunyi   : "+Bersuara());
    }
}
