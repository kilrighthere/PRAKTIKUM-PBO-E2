/* 
 * File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi obejek person
 * Pembuat : Shakila Tungga Dewi/24060123120025
 * Tanggal : 15 Mei 2025
 */

import java.io.*;
class Person implements Serializable {
    private String name;
    public Person (String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}


public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis person");
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}