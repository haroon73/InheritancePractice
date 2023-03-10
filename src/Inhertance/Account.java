package Inhertance;

public abstract class Account {
    private int accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private String DoB;
    protected double balance;


    public Account(){
        this.accountNo = 0;
        this.name = "";
        this.address = "";
        this.phoneNo ="";
        this.DoB ="";
        this.balance = 0.0f;
    }

    public Account(int accountNo , String name , String address , String phoneNo , String DoB , double balance){
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo =phoneNo;
        this.DoB =DoB;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String clossAcount(String name){
        return name;
    }


}
