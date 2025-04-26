package PRAKTIKUM_6.Anabul;

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
