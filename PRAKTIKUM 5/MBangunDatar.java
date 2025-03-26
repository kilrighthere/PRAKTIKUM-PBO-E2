/* Nama file    : MBangunDatar.java
* Deskripsi    : Main Program kelas Bangun Datar
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 23 Maret 2025
*/

public class MBangunDatar {
    public static void main(String[] args){

    //Membuat objek BangunDatar
    // BangunDatar bd = new BangunDatar();  //error karena abstrak tida bisa digunakan untuk mengindtansiasi objek
    BangunDatar P1 = new Persegi(10.0, "Biru", "Putih"); //abstract class dapat digunakan sebagai type
    Persegi P2 = new Persegi(5.0, "Ungu", "Merah");
    BangunDatar L1 = new Lingkaran(7.0, "Hijau", "Kuning"); //abstract class dapat digunakan sebagai type
    Lingkaran L2 = new Lingkaran(14.0, "Coklat", "Hitam"); 

    // Menampilkan informasi objek Persegi
    System.out.println("Informasi Persegi P1");
    P1.printInfo();
    System.out.println();
    System.out.println("Informasi persegi P2");
    P2.printInfo();
    System.out.println();

    // Menampilkan informasi ibjek Lingkaran
    System.out.println("Informasi Lingkaran L1");
    L1.printInfo();
    System.out.println();
    System.out.println("Informasi Lingkaran L2");
    L2.printInfo();
    System.out.println();

    // Membandingkan Objek Bangun Datar
    System.out.println("Luas persegi P1 = Luas Lingkaran L2? : " + P1.isEqualLuas(L2));
    System.out.println("Keliling persegi P1 = Keliling Lingkaran L2? : " + P1.isEqualKeliling(L2));

    // menampilkan informasi sebelum dizoom
    System.out.println("sebelum zoom");
    System.out.println("sisi persegi P2 : " + P2.getSisi());
    System.out.println("Sisi Lingkaran L2 : " + L2.getJari());
    System.out.println();

    // Menggunakan method dari IResize
    P2.zoomIn(); //Memperbesar ukuran persegi 10%
    L2.zoomOut(); //Memperkecil ukuran Lingkaran 10%

    System.out.println("Setelah zooom");
    System.out.println("Sisi persegi P2 : "+ P2.getSisi());
    System.out.println("Sisi Lingkaran " + L2.getJari());
    System.out.println();

    // Menggunakan zoom dengan persen tertentu
    P2.zoom(50); //memperbesar ukuran persegi 50% dari ukuran aslinya
    L2.zoom(200); //Memperbesar ukuran Lingkaran menjadi 200% dari ukuran aslinya

    System.out.println("Setelah zoom dengan Persen ");
    System.out.println("Sisi Persegi P2 "+ P2.getSisi());
    System.out.println("Sisi Lingkaran L2 : "+L2.getJari());
    }
}
