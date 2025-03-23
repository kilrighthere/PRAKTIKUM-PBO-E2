// package PRAKTIKUM 4;

/* Nama file    : Persegi.java
* Deskripsi    : Program untuk implementasi kelas Persegi
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 13 Maret 2025
*/

public class Persegi extends BangunDatar {
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
}
