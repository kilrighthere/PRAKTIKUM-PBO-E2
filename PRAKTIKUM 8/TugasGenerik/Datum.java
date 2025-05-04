/* 
 * Nama File    : Datum.java
 * Deskripsi    : Class Representasi single data untuk kelas generic dari anabul
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Sabtu, 3 Mei 2025
 */

package TugasGenerik;

public class Datum <T>{
    private T isi;

    public void setIsi(T jenisAnabul){
        isi = jenisAnabul;
    }

    public T getIsi(){
        return isi;
    }
}
