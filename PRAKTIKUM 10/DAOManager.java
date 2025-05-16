/* 
 * Nama File : DAOManager.java
 * Deskripsi : Pengelola DAO dalam program
 * Pembuat : Shakila Tungga Dewi / 24060123120025
 * Tanggal : 15 Mei 2025
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
