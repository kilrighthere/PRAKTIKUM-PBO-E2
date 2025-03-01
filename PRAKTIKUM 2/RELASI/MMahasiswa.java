/* Nama File    : MMahasiswa.java */
/* Deskripsi    : berisi Main Program dari kelas Mahasiswa*/
/* Pembuat      : Shakila Tungga Dewi*/
/* NIM          : 24060123120025 */
/* Tanggal      : 27 Februari 2025*/

package RELASI;

public class MMahasiswa {
    public static void main(String[] args) {
        // membuat object mata kuliah baru yaitu PBO
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);

        // membuat object mata kuliah baru yaitu MBD
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        // membuat object mahasiswa baru yaitu M1
        Mahasiswa M1 = new Mahasiswa("0025", "Shakila Tungga Dewi", "Informatika");

        // membuat object Dosen baru yaitu D1
        Dosen D1 = new Dosen("123", "Andi", "Informatika");

        // membuat object Kendaraan baru yaitu K1
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");

        // mengeset dosen wali dari object mahasiswa M1 dengan object dosen D1
        M1.setdosenWali(D1);

        // mengeset kendaraan dari object mahasiswa M1 dengan object kendaraan K1
        M1.setKendaraan(K1);

        // menambahkan object matakuliah MBD pada object mahasiswa M1
        M1.addMatkul(MBD);

        // menambahkan object matakuliah PBO pada object mahasiswa M1
        M1.addMatkul(PBO);

        // menampilkan nim, nama, dan prodi mahasiswa
        M1.printMhs();

        // menampilkan detail mahasiswa
        M1.printDetailMhs();

        // menampilkan jumlah matakuliah dari object mahasiswa M1
        System.out.println("Jumlah Mata Kuliah : " + M1.getJumlahMatkul());

        // menampilkan jumlah SKS dari object mahasiswa M1
        System.out.println("Jumlah SKS Mata Kuliah : " + M1.getJumlahSKS());
    }
}
