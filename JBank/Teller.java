
/**
 * Class Teller adalah kelas yang merupaka entry point dari JBank
 * 
 * @author (Alberto Michael Tambunan)
 * @version 26/02/2016
 */
public class Teller {
  
     /**
     * Method Cunstructor Teller
     */
    public Teller() {
        //Constructor Teller
        
    }

      /**
     * Fungsi utama dari Teller adalah untuk membuat objek baru yang isinya adalah akun 
     * dan data Customer seperti balance.Class ini juga dapat menampilkan nilai akun dan balancenya 
     * @param args Arguments
     */
    public static void main(String[] args) {
        Customer c1 = new Customer(); //membuat sebuah objek c1 dari class Customer               
        Account a1 = new Account();   //membuat sebuah objek a1 dari class Account                
        a1.setBalance(500);   //mengeset balance pada objek a1                      
        c1.setAccount(a1);    //mengeset akun pada c1 yang akan berisi sama dengan a1                     
        c1.setName("Sanadhi", "Sutandi");   //mengeset nama customer c1      
        System.out.println(c1.getCustomerName()); //mencettak nama Customer   
        Account a2 = c1.getAccount(); //membuat objek baru yang isinya adalah akun dari c2
        System.out.println(a2.getBalance()); //mencettak balance dari akun
        
        
        
    }
}
