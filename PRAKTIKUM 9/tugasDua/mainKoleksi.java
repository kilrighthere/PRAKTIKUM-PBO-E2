// import java.util.ArrayList;
/* 
 * Nama File    : mainKoleksi.java
 * Deskripsi    : Class Representasi kelas utama dari kelas Koleksi
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 8 Mei 2025
 */


public class mainKoleksi {
    public static void main(String[] args) {
        // inisialisasi objek str bertipe koleksi
        Koleksi<Character> str = new Koleksi<>();

        // menampilkan jumlah elemen sebelum penambahan elemen
        System.out.println("jumlah elemen str : "+ str.getSize());

        // menambahkan elemen
        System.out.println();
        System.out.println("menambahkan 10 elemen character ke dalam str");
        for (char c = 'A' ; c <= 'J'; c++){
            str.add(c);
        }
        
        // menampilkan keseluruhan isi elemen
        System.out.println();
        str.showAll();
        
        // menampilkan elemen ke 7
        System.out.println();
        System.out.println("elemen str ke 7: "+ str.getIsi(7));
        
        // mengganti elemen ke 7 dengan huruf k
        System.out.println();
        System.out.println("meng-update elemen ke 7 dalam str");
        str.setIsi(7, 'K');
        
        // menampilkan elemen ke 7
        System.out.println();
        System.out.println("menampilkan elemen ke 7 setelah perubahan");
        System.out.println("elemen str ke 7: "+ str.getIsi(7));
        
        // mengubah ukuran array str
        System.out.println();
        System.out.println("mengubah ukuran array str menjadi 7");
        str.setSize(7);
        System.out.println();
        System.out.println("jumlah elemen str : "+ str.getSize());
        
        // menampilkan elemen str setelah perubahan ukuran
        System.out.println();
        System.out.println("elemen str setelah perubahan ukuran");
        str.showAll();
        
        // menambahkan satu elemen kedalam str
        System.out.println();
        System.out.println("menambahkan satu elemen ke dalam str");
        char x = 'X';
        str.add(x);

        System.out.println("elemen str ke 8: "+ str.getIsi(7));

        // menampilkan elemen setelah penambahan
        System.out.println("elemen str setelah penambahan elemen");
        str.showAll();
        

        // menghapus satu elemen str
        System.out.println();
        System.out.println("menghapus elemen di indeks terakhir");
        char y = str.delete();
        System.out.println("elemen yang dihapus adalah : "+y);
        str.showAll();


    }
}
