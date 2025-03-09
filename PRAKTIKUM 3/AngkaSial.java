// package PRAKTIKUM 3;
/*
* Nama file    : AngkaSial.java
* Deskripsi    : Program penggunaan exception buatan sendiri
                 Pengenalan klausa 'throw' dan 'throws'
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 6 Maret 2025
*/
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getaaMassage talah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka o((> ~ < ))o");
        }
    }
}

/* 
 * Ketika eksepsi terjadi, baris 14 (line d bawah pengecekan angka sial) tidak akan dieksekusi.
 * Hal ini karena ketika terjadi eksepsi, program akan langsung menuju block catch karena eksepsi terdeteksi di body program,
 * dan kemudian menampilkan pesan eksepsi serta menjalankan line instruksi lain di block catch
 * Baris 14, pada dasarnya di eksekusi apabila pengecekan if(angka==13) (pengecekan terjadi eksepsi atau tidak) pada methode coba Angka tidak terpenuhi
 * Karena kondisi eksepsi terpenuhi methode coba angka akan langsung throw eksepsi AngkaSialException
 * dan seluruh baris kode di bawah code tidak akan di eksekusi
 * 
 * Hal ini lah mengapa ketika terjadi eksepsi baris kode pada line 23 dieksekusi, karena eksepsi terdeteksi oleh methode angka sial,
 * dan di tangkap oleh eksepsi AngkaSialException sebagai handler yang sesuai untuk eksepsi ini
 */
