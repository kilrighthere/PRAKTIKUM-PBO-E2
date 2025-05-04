package TugasGenerik;

public class AplikasiDatum {
    public static void main(String[] args) {
        // membuat objek anabul
        Anabul pet1 = new Anjing("coki");
        Anabul pet2 = new Kucing("Mpus");
        Anabul pet3 = new Kucing("Tweety");

        // membuat objek p1 datum dengan tipe generik anabul
        Datum<Anabul> p1 = new Datum<Anabul>();

        // mengisi atribut p1 dengan pet 1
        p1.setIsi(pet1);
        // menampilkan informasi anabul pet1 melalui objek datum
        System.out.println("pet 1 bergerak dengan : "+p1.getIsi().Gerak());
        System.out.println("pet 1 bersuara dengan : "+p1.getIsi().Bersuara());
        p1.getIsi().infoAnabul();
        System.out.println();
        
        // mengisi atribut p1 dengan pet2
        p1.setIsi(pet2);
        // menampilkan informasi anabul pet2 melalui objek datum
        System.out.println("pet 2 bergerak dengan : "+p1.getIsi().Gerak());
        System.out.println("pet 2 bersuara dengan : "+p1.getIsi().Bersuara());
        p1.getIsi().infoAnabul();
        System.out.println();
        
        // mengisi atirbut p1 dengan pet3
        p1.setIsi(pet3);
        // menampilkan informasi anabul pet3 melalui objek datum
        System.out.println("pet 3 bergerak dengan : "+p1.getIsi().Gerak());
        System.out.println("pet 3 bersuara dengan : "+p1.getIsi().Bersuara());
        p1.getIsi().infoAnabul();
            

    }
}
