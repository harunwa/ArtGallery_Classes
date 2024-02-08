public class Customer {
    private String name;
    private double wallet;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getWallet(){
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
