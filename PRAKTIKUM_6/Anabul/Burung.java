package PRAKTIKUM_6.Anabul;

public class Burung extends Anabul{
    // atribut
    private String gerak = "terbang";
    private String bunyi = "cuit";

    // konstruktor
    public Burung(String nama){
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
        System.out.println("Gerak   : "+Gerak());
        System.out.println("Bunyi   : "+Bersuara());
    }
}

