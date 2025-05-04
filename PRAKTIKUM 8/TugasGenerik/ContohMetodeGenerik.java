/* 
 * Nama File    : ContohMetodeGeneric.java
 * Deskripsi    : Representasi Pengedali methode pada kelas generic Datum
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Sabtu, 3 Mei 2025
 */

package TugasGenerik;

public class ContohMetodeGenerik {

    // methode  untuk mengubah jenis hewan pada class Datum<T>
    public static <T extends Anabul> void setDatum(Datum<T> pet, T anabul){
        pet.setIsi(anabul);
    }

    // methode untuk menampilkan gerak dari hewan yang ada di Datum <T>
    public static <T extends Anabul> void getGerak(Datum<T> pet){
        System.out.println(pet.getIsi().Gerak());

    }

    // methode untuk menampilkan suara dari hewan yang ada di dalam kelas Datum<T>
    public static <T extends Anabul> void getSuara(Datum<T> pet){
        System.out.println(pet.getIsi().Bersuara());
        
    }

    // methode untuk menampilkan informasi anabul yang ada pada Datum<T>
    public static <T extends Anabul> void InfoPetDatum(Datum<T> pet){
        pet.getIsi().infoAnabul();
    }
    
    // methode untuk menampilkan jenis kelas dalam Datum<T?
    public static <T extends Anabul> void InfoDatum(Datum<T> pet){
        System.out.println("Tipe generic : " + pet.getIsi().getClass().getName());
    }

}
