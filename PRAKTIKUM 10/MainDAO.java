/* 
 * Nama File : MainDAO.java
 * Deskripsi : Main Program untuk akses DAO
 * Pembuat : Shakila Tungga Dewi/24060123120025
 * Tanggal : 15 Mei 2025
 */

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        // Person person2 = new Person("Panji");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
