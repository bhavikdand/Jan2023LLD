package design_patterns.adapter;

public class PhonePe {

    BankAPI api;

    public PhonePe(BankAPI api){
        this.api = api;
    }

    public float getBalance(String accountNumber){
        return api.checkBalance(accountNumber);
    }

    public boolean sendMoney(String from, String to, float amount){
        return api.sendMoney(from, to, amount);
    }
}
