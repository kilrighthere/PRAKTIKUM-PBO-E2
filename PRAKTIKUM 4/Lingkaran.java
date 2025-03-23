/* Nama file    : Lingkaran.java
* Deskripsi    : program untuk implementasi kelas Lingkaran
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 13 Maret 2025
*/

public class Lingkaran extends BangunDatar{
    private double jari;
    
    public Lingkaran(){

    }

    // public Lingkaran(double jari, String warna, String border) {
    //     super(0, warna, border); // Memanggil konstruktor superclass BangunDatar
    //     this.jari = jari;
    // }
    

    public Lingkaran (double diameter,String warna, String border ){
        super(1, warna, border);
        this.jari = diameter/2;
        // setBorder(border);
        // setWarna(warna);
        // setJmlSisi(1);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI*jari*jari;
    }
    
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari : " + jari);
    }
}
