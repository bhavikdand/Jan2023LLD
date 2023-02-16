package design_patterns.adapter.third_party;

public class ICICIBankAPI {
    public float fetchBalance(String account){
        return 100.34f;
    }

    public boolean initiateTransaction(String from, String to, float amount){
        System.out.println("Sent money");
        return true;
    }

}
