/* Nama file    : Lingkaran.java
* Deskripsi    : program untuk implementasi kelas Lingkaran
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 23 Maret 2025
*/

public class Lingkaran extends BangunDatar implements IResize{
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

    // prosedure implementasi iResize
    // menambah ukuran menjadi 10% lebih besar
    @Override // menandakan overide dari interface
    public void zoomIn(){
        jari = jari*1.1;
    }

    // mengurangi ukuran menjadi 10% lebih kecil
    @Override // menandakan overide dari interface
    public void zoomOut(){
        jari = jari * 0.9;
    }

    // menskalakan ukuran sesuai dengan inputan yang diberikan
    @Override // menandakan overide dari interface
    public void zoom(int percent){
        jari = jari* percent/100;
    }
}
