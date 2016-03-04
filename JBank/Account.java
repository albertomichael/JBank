/**
 * Class Account adalah kelas yang menangani akun Customer seperti ID,tipe dari akun,saldo tabungan 
 * dan menangani penarikan saldo dari akun
 * @author (Alberto Michael)
 * @version 27/02/2016
 */

public class Account
{
    private char acctType;
    private double balance;
    private String id;

    /**
     * Method Cunstructor Account
     */
    public Account(){
         acctType = 'S';
         balance = 10.00;
    }

    /**
     * Method Cunstructor Account
     * @param type tipe akun
     * @param amount banyaknya saldo
     */
    public Account (char type, double amount) {
    
    }
    
    /**
     * Method Mutator deposit , Method ini akan menambahkan saldo akhir dengan jumlah uang yang ingin dimasukan kedalam saldo dari akun tersebut 
     * @param amount banyaknya saldo
     */
    public boolean deposit(double amount) {
        if (amount < 0){
            return false;
        }
        else{
            balance = balance + amount; //mengubah variabel balance dengan rumus balance + amount ntuk menambahkan saldo
            return true;
        }
    }
    
    /**
     * Method Accessor getAcctType
     * @return tipe akun
     */
    public char getAcctType() {
        return acctType; 
        // mengembalikan nilai ke accType
    }
    
    /**
     * Method Accessor getBalance
     * @return saldo akun
     */
    public double getBalance() {
        return balance; 
        //mengembalikan nilai kebalance
    }
    
    /**
     * Method Accessor getId
     * @return ID akun
     */
    public String getId() {
        return id;
       //mengembalikan nilai ke Id
    }
    
    /**
     * Method Mutator setBalance , Method yang mengeset nilai param amount sama dengan balance
     * @param amount banyaknya saldo
     */
    public void setBalance(double amount) {
        balance = amount;
        // mengeset balance pada saldo seorang customer
    }
    
    /**
     * Method Mutator setID , Method yang mengeset akun ID 
     * @param acctId ID dari akun
     */
    public void setID(String acctId) {
        id = acctId;
        // mengeset ID akun        
    }
    
    /**
     * Method Mutator setAcctType , Method yang mengeset tipe dari akun
     * @param type tipe akun
     */
    public void setAcctType(char type) {
        acctType = type; 
        // mengeset tipe akun
    }
    
    /**
     * Method Mutator withdraw , Method yang mengeset jumlah uang yang dapat 
     * @param amount banyaknya saldo
     */
    public boolean withdraw(double amount) {
        //Mutator untuk melakukan pengambilan saldo
        if (balance-amount < 0){
            return false;
        }
        else{
            balance = balance - amount;
            return true;
        }
        
    }
    
}
