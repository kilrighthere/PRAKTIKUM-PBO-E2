// package PRAKTIKUM 3;
/* Nama file    : AngkaSialException.java
* Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13
* Pembuat      : Shakila Tungga Dewi/24060123120025
* Tanggal      : 6 Maret 2025
*/


public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial <(* '^')>");
    }
}
