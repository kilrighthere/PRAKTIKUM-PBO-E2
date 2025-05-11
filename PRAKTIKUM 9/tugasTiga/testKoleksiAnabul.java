/* 
 * Nama File    : testKoleksiAnabul.java
 * Deskripsi    : Main Class Representasi testKoleksiAnabul
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 26 April 2025
 */
public class testKoleksiAnabul {
    public static void main(String[] args) {
        // inisialisasi objek KoleksiAnabul
        KoleksiAnabul<Anabul> koleksiAnabul = new KoleksiAnabul<>();

        // inisialisasi array objek Anabul
        Anabul[] anabulList = {
            new Kucing("Mochi"),
            new Anjing("Choco"),
            new Burung("Tweety"),
            new Kucing("Candy"),
            new Anjing("Oreo"),
            new Burung("Chip"),
            new Kucing("Matcha"),
            new Anjing("Mocha"),
            new Kucing("Cheese"),
            new Anjing("Brownie")
        };
        
        // inisialisasi 2 objek anabul
        Anabul hewan7 = new Kucing("matcha");
        Anabul hewan10 = new Anjing("brownie");

        // menampilkan jumlah elemen sebelum penambahan elemen
        System.out.println("jumlah elemenkoleksiAnabul : "+ koleksiAnabul.getSize());

        // menambahkan elemen
        System.out.println();
        System.out.println("menambahkan 10 elemen character ke dalamkoleksiAnabul");
        for (Anabul a : anabulList) {
            koleksiAnabul.add(a);
        }

        // menampilkan anggota koleksiAnabul setelah penambahan elemen
        koleksiAnabul.showAll();

        // menampilkan elemen ke 5
        System.out.println();
        System.out.print("elemen koleksiAnabul ke 5: ");
        koleksiAnabul.getIsi(5).infoAnabul();  
        
        // mengganti elemen ke 5 dengan hewan7
        System.out.println();
        System.out.println("meng-update elemen ke 5 dalam koleksiAnabul");
        koleksiAnabul.setIsi(5, hewan7);
        
        // menampilkan elemen ke 7 setelah update
        System.out.println();
        System.out.print("elemen koleksiAnabul ke 5 setelah update: ");
        koleksiAnabul.getIsi(5).infoAnabul();
        
        // mengubah ukuran array koleksiAnabul
        System.out.println();
        System.out.println("mengubah ukuran array koleksiAnabul menjadi 7");
        koleksiAnabul.setSize(7);
        System.out.println();
        System.out.println("jumlah elemen koleksiAnabul : "+ koleksiAnabul.getSize());
        
        // menampilkan elemen koleksiAnabul setelah perubahan ukuran
        System.out.println();
        System.out.println("elemen koleksiAnabul setelah perubahan ukuran");
        koleksiAnabul.showAll();
        
        // menambahkan satu elemen kedalam koleksiAnabul
        System.out.println();
        System.out.println("menambahkan satu elemen ke dalam koleksiAnabul");
        koleksiAnabul.add(hewan10);

        System.out.print("elemen koleksiAnabul ke 7 setelah penambahan 1 elemen : ");
        koleksiAnabul.getIsi(7).infoAnabul();

        // menampilkan elemen setelah penambahan
        System.out.println("elemen koleksiAnabul setelah penambahan elemen");
        koleksiAnabul.showAll();
        
        // menghapus satu elemen koleksiAnabul
        System.out.println();
        System.out.println("menghapus elemen di indeks terakhir");
        Anabul y = koleksiAnabul.delete();
        System.out.print("elemen yang dihapus adalah : ");
        y.infoAnabul();
        System.out.println();
        
        System.out.println("elemen koleksiAnabul setelah penghapusan elemen");
        koleksiAnabul.showAll();
    }
}
