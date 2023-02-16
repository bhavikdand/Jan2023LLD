package design_patterns.adapter;

import design_patterns.adapter.third_party.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPI{
    ICICIBankAPI api = new ICICIBankAPI();
    @Override
    public boolean sendMoney(String from, String to, float amount) {
        return api.initiateTransaction(from, to, amount);
    }

    @Override
    public float checkBalance(String account) {
        return api.fetchBalance(account);
    }
}
