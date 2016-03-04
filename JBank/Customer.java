import java.util.regex.*; // import fungsi untuk REGEX
/**
 * Class Customer berfungsi untuk permasalahan data untuk Customer seperti nama,nomor telepon,dan alamat.
 * @author (Alberto Michael Tambunan) 
 * @version 26/02/2016
 */

public class Customer
{
    private Account accounts;
    private String cityAddress;
    private int custId;
    private String dateOfBirth;
    private String email;
    private String firstName;
    private String lastName;
    private int numberOfCurrentAccounts;
    private String streetAddress;
    private String phoneNumber;
    private String zipOrPostalCode;
    
    /**
     * Constructor dari Customer
     */
    public Customer()
    {
    }
    
    /**
     * Constructor dari Customer, dengan input yang berbeda
     * @param fname parameter pertama, belum digunakan
     * @param lname parameter kedua, belum digunakan
     * @param dob parameter ketiga, belum digunakan
     */
    public Customer(String fname, String lname)
    {
        this(fname,lname,"none");
    }

    /**
     * Constructor dari Customer, dengan input yang lebih berbeda
     * @param firstName parameter pertama, belum digunakan
     * @param lastName parameter kedua, belum digunakan
     * @param dateOfBirth parameter ketiga, belum digunakan
     * @param custId parameter keempat, belum digunakan
     */
    public Customer(String firstName, String lastName, String dateOfBirth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        custId = new Bank().getNextID();
    }
    
    /**
     * Method accessor untuk memperoleh alamat pelanggan
     * @return itu liat aja panjang, mengembalikan alamat pelanggan
     */
    private String getAddress()
    {
        return streetAddress + ", " + cityAddress + ", " + zipOrPostalCode;
    }
    
    /**
     * Method accessor untuk memperoleh akun pelanggan
     * @return accounts mengembalikan jenis akun
     */
    private Account getAccount()
    {
        return accounts;
    }
    
    /**
     * Method accessor untuk memperoleh id pelanggan
     * @return custId mengembalikan id pelanggan
     */
    private int getCustomerId()
    {
        return custId;
    }
    
    /**
     * Method mutator untuk mengubah id pelanggan
     * @param custId parameter untuk id pelanggan
     */
    private void setCustomerId(int ID)
    {
        custId = ID;
    }
    
    /**
     * Method accessor untuk memperoleh email pelanggan
     * @return email mengembalikan email pelanggan
     */
    private String getEmail()
    {
        return email;
    }
    
    /**
     * Method accessor untuk memperoleh nama pelanggan
     * @return itu liat aja panjang, mengembalikan nama pelanggan
     */
    public String getCustomerName()
    {
        return lastName + ", " + firstName;
    }
    
    /**
     * Method accessor untuk memperoleh jumlah akun pelanggan
     * @return numberOfCurrentAccounts mengembalikan jumlah akun pelanggan
     */
    public int getNumOfAccounts()
    {
        return numberOfCurrentAccounts;
    }
    
    /**
     * Method accessor untuk memperoleh nomer telpon pelanggan
     * @return phoneNumber mengembalikan nomer telpon pelanggan
     */
    private String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Method mutator untuk mengeset alamat pelanggan
     * @param street parameter pertama untuk nama jalan
     * @param city parameter kedua untuk nama kota
     * @param code parameter ketiga untuk kode pos
     */
    private void setAddress(String street, String city, String code)
    {
        streetAddress = street;
        cityAddress = city;
        zipOrPostalCode = code;
    }
    
    /**
     * Method mutator untuk mengeset email pelanggan
     * @param emailAddress parameter untuk email pelanggan
     */
    private void setEmail(String emailAddress)
    {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      if (emailAddress.matches(regex))
      {
          email = emailAddress;
          System.out.println ("Email yang dimasukkan Valid");
      }
      else
      {
          System.out.println ("Email yang dimasukkan Invalid");
      }
    }
    
    /**
     * Method mutator untuk mengeset nama pelanggan
     * @param lname parameter pertama untuk nama belakang
     * @param fname parameter kedua untuk nama depan
     */
    public void setCustomerName(String lname, String fname)
    {
        lastName = lname;
        firstName = fname;
    }
    
    /**
     * Method mutator untuk mengeset nomer telpon pelanggan
     * @param phoneNum parameter untuk nomer telpon pelanggan
     */
    private void setPhoneNumber(String phoneNum)
    {
        phoneNumber = phoneNum;
    }
    
    /**
     * Method mutator untuk mengeset akun pelanggan
     * @param a untuk jenis akun pelanggan
     */
    public void setAccount(Account a)
    {
        accounts = a;
    }
}