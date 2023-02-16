package design_patterns.adapter;
public interface BankAPI {

    boolean sendMoney(String from, String to, float amount);

    float checkBalance(String account);

}
