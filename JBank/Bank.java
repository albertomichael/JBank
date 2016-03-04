
/**
 * Class Bank adalah class yang menangani segala perhitungan transaksi 
 * yang dilakukan oleh customer seperti bunga pinjaman
 * @author (Alberto Michael Tambunan)
 * @version 26/02/2016
 */

public class Bank {
    private static double creditInterestRate;
    private static double investmentInterestRate;
    private static double premiumInterestRate;
    private static int lastCustID;
    private static int nextID;
    private static int nextCustID = 0;
    private static int numOfCurrentCustomer;
    public static int maxNumOfCustomers = 20;
    private static String closeTime;
    private static String startTime;
    private static String phone;
    public static String website;
    public static String bankAddress = "1234 JavaStreet, AnyCity, ThisState, 34567";
    public static String bankName = "JBANK";
     /**
      * Method Constructor bank
      */
    public Bank() {        
    }

     /**
     * Method Accessor Account
     * @return ke nilai null
     */
    public static String getAddress() {
        return null; //mengembalikan nilai ke null
    }
    
     /**
     * Method Accessor getCreditRate
     * @return ke nilai 0
     */
    public static double getCreditRate() {
        return 0; //mengembalikan nilai ke 0
    }
    
     /**
     * Method Accessor getCreditRate
     * @return ke nilai 0
     */
    public static double getInvestmentRate() {
        return 0; //mengembalikan nilai ke 0
    }
    
     /**
     * Method Accessor getHoursOfOperation
     * @return ke null
     */
    public static String getHoursOfOperation() {
        return null; //mengembalikan nilai ke null
    }
    
     /**
     * Method Accessor getLastID
     * @return ke nilai 0
     */
    public static int getLastID() {
        return 0; //mengembalikan nilai ke 0
    }
    
     /**
     * Method Accessor getLastID
     * @return ke nilai 0
     */
    public static int getMaxCustomers() {
        return 0; //mengembalikan nilai ke 0
    }
    
     /**
     * Method Accessor getName
     * @return ke nilai null
     */
    public static String getName() {
        return null; //mengembalikan nilai ke null
    }
    
    /**
     * Method Accessor getNumOfCurrentCustomers
     * @return banyaknya customer yang ada saat ini
     */
    public static int getNumOfCurrentCustomers() {
        return numOfCurrentCustomer;
    }
    
     /**
     * Method Accessor getNextID
     * @return ke nomor customer ID selanjutnya
     */
    public static int getNextID() {
        if (nextCustID == 0)
        {
            nextCustID = 1000;
            numOfCurrentCustomer +=1;
            return nextCustID;
        }
        else
        {
            if (numOfCurrentCustomer == maxNumOfCustomers)
            {
                return 0;
            }
            else
            {
                lastCustID = nextCustID;
                nextCustID +=1;
                numOfCurrentCustomer +=1;
                return nextCustID;
            }
        }
    }
    
     /**
     * Method Accessor getWebsite
     * @return ke nilai null
     */
    public static String getWebsite() {
        return null; //mengembalikan nilai ke null
    }
    
     /**
     * Method Accessor getPremiumRate
     * @return ke nilai 0
     */
    public static double getPremiumRate() {
        return 0; //mengembalikan nilai ke 0
    }
    
     /**
     * Method Accessor getPhone
     * @return ke nilai null
     */
    public static String getPhone() {
        return null; //mengembalikan nilai ke null
    }
    
     /**
     * Method Mutator getCreditRate
     * @param rate bunga credit
     */
    public static void setCreditRate(double rate) {
        
    }
    
     /**
     * Method Mutator getPremiumRate
     * @param rate bunga investment
     */
    public static void setInvestmentRate(double rate) {
        
    }
    
     /**
     * Method Mutator getPremiumRate
     * @param rate bunga pinjaman
     */
    public static void setPremium(double rate) {
        
    }
}
