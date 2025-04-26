/* 
 * Nama File    : Coercion.java
 * Deskripsi    : Contoh Polimorfisme Coercion
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6;

public class Coercion {
    
    public static void main(String[] args) {
        // program nomor 1 
        int output1 = 'a';
        System.out.println(output1);
        /* Output : 97 (Berhasil)
         * Penjelasan : coercion secara implisit, character a pada java apabila dilakukan outputing
         * dalam type data integer, maka java akan mengconvert karakter tersebut dalam
         * format integer secara implisit, yaitu melakukan decode menjadi ascii code
         */

        // Program nomor 2
        // double x = 15.5;
        // int output2 = x;
        // System.out.println(output2);
        /* Ouput : gagal (cannot convert from double to int)
         * Penjelasan : Coercion, java tidak dapat langsung menconvert dari type data
         * double ke integer karena akan ada data yang hilang, dalam hal ini  0.5
        */

        // program nomor 3
        int y = 25;
        double output3 = y;
        System.out.println(output3);
        /* Output : 25.0 (berhasil)
         * Penjelasan : Terjadi proses koersi (coercion) secara implisit oleh sistem, 
         * di mana nilai bertipe integer secara otomatis dikonversi menjadi tipe double saat assignment. 
         * Nilai 25 akan menjadi 25.0 untuk merepresentasikan tipe data double. 
         * Proses ini termasuk ke dalam widening primitive conversion, dan tidak memerlukan casting eksplisit.
        */

        // program nomor 4
        int z = 78;
        char output4 = (char)z;
        System.out.println(output4);
        /* Output : N (berhasil)
         * Penjelasan : Casting, dilakukan proses casting secara explisit dari type data integer ke type data char.
         * Nilai intger 78 yang tersimpan di dalam variabel z dikonversi menjadi karakter sesuai representasi ASCII, 
         * yaitu karakter 'N'. 
         */

        // program nomor 5
        char a = 'a';
        double output5 = a;
        System.out.println(output5);
        /* Output : 97.0 (berhasil)
         * Penjelasan : Dilakukan proses koersi (coercion) secara implisit oleh sistem, 
         * di mana tipe data char dikonversi otomatis menjadi tipe data double. 
         * Nilai karakter 'a' direpresentasikan sebagai angka 97 berdasarkan tabel ASCII, 
         * dan saat dikonversi ke double, hasilnya menjadi 97.0. 
         * Proses ini tidak memerlukan casting eksplisit karena termasuk tipe widening conversion.
         */
    }
}
