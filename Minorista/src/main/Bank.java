package main;

public class Bank {

    private int BankID;
    private Client client;
    private String BankType;

    public Bank(String type, int BankID, Cient client) {
        this.BankID = BankID;
        this.BankType = type;
        this.Client = client;
    }

    public void getBankID() {
        return this.BankID;
    }

    public void getClient() {
        return this.client;
    }

    public void BankType() {
        return this.BankType;
    }

}
