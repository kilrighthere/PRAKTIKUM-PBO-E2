// package PRAKTIKUM 4;

/* Nama file    : Persegi.java
* Deskripsi    : Program untuk implementasi kelas Persegi
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 23 Maret 2025
*/

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi (double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);

        // this.jmlSisi = 4;
        // this.warna = warna;
        // this.border = border;
        // this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getDigonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

    // prosedure implementasi iResize
    // menambah ukuran menjadi 10% lebih besar
    @Override // menandakan overide dari interface
    public void zoomIn(){
        sisi = sisi*1.1;
    }

    // mengurangi ukuran menjadi 10% lebih kecil
    @Override // menandakan overide dari interface
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    // menskalakan ukuran sesuai dengan inputan yang diberikan
    @Override // menandakan overide dari interface
    public void zoom(int percent){
        sisi = sisi* percent/100;
    }
}
