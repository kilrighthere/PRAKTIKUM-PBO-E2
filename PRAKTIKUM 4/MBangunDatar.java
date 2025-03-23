/* Nama file    : MBangunDatar.java
* Deskripsi    : Main Program kelas Bangun Datar
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 13 Maret 2025
*/

public class MBangunDatar {
    public static void main(String[] args){

    //Membuat objek BangunDatar
    BangunDatar bd = new BangunDatar();
    bd.setJmlSisi(3);
    bd.setWarna("Merah");
    bd.setBorder("Hitam");

    //Membuat objek Persegi
    Persegi p = new Persegi(5, "Hijau", "Kuning");

    System.out.println("Info BangunDatar");
    bd.printInfo();

    System.out.println("");
    
    System.out.println("Info persegi");
    System.out.println("Jumlah sisi persegi : " + p.getJmlSisi());
    System.out.println("Warna persegi : " + p.getWarna());
    System.out.println("Border persegi : " + p.getBorder());
    System.out.println("Ukuran sisi BangunDatar : " + p.getSisi());
    p.printInfo();
    

//     //Membuat objek Lingkaran
     Lingkaran l = new Lingkaran(0, null, null);

    System.out.println("Info BangunDatar");
    bd.printInfo();

    System.out.println("");
    
    System.out.println("Info Lingkaran");
    System.out.println("Warna Lingkaran : " + l.getWarna());
    System.out.println("Border Lingkaran : " + l.getBorder());
    System.out.println("Ukuran sisi BangunDatar : " + l.getJari());
    l.printInfo();
    }
}
