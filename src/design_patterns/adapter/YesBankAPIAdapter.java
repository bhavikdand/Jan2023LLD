package design_patterns.adapter;

import design_patterns.adapter.third_party.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI api = new YesBankAPI();
    @Override
    public boolean sendMoney(String from, String to, float amount) {
        return api.transact(from, to, amount);
    }

    @Override
    public float checkBalance(String account) {
        return api.getBalance(account);
    }
}
