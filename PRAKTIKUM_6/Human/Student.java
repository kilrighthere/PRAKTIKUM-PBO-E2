/* 
 * Nama File    : Student.java
 * Deskripsi    : Class Representasi Student
 * Pembuat      : Shakila Tungga Dewi / 24060123120025
 * Tanggal      : Kamis, 24 April 2025
 */

package PRAKTIKUM_6.Human;

public class Student extends Person{
    // konstruktor
    public Student(String name){
        super(name);
    }

    // method
    public boolean isAsleep(int hr){
        return 2<hr && 8>hr;
    }
}
