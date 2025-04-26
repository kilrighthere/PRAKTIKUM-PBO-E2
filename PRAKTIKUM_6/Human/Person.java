/* 
 * Nama File    : Person.java
 * Deskripsi    : Super Class Representasi Person
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6.Human;

public class Person {
    // atribut
    private String name;

    // Konstruktor
    public Person(String name){
        this.name = name;
    }

    // method
    public boolean isAsleep(int hr){
        return hr>22 || hr<7;
    }

    public String toString(){
        return name;
    }

    public void status(int hr){
        if (this.isAsleep(hr)){
            System.out.println("Now offline : " + this);
        }
        else{
            System.out.println("Now online : "+this);
        }
    }
}
