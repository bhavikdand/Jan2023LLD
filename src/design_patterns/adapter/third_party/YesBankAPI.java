package design_patterns.adapter.third_party;

public class YesBankAPI {

    public float getBalance(String account){
        return 100.34f;
    }

    public boolean transact(String from, String to, float amount){
        System.out.println("Sent money");
        return true;
    }
}
