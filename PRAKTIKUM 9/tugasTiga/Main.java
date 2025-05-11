// package PRAKTIKUM_6.Anabul;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Anabul hewan1 = new Kucing("Mochi");
        Anabul hewan2 = new Anjing("Choco");
        Anabul hewan3 = new Burung("Tweety");

        
        ArrayList<Anabul> animal = new ArrayList<>();
        animal.add(hewan1);
        animal.add(hewan2);
        animal.add(hewan3);
        
        for (Anabul anim : animal){
            anim.infoAnabul();
            System.out.println();
        }


    }
}
