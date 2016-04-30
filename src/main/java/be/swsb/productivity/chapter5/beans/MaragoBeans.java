package be.swsb.productivity.chapter5.beans;

public class MaragoBeans extends CoffeeBeans {

    private String maragoScent = "marago";

    @Override
    public String scent() {
        return maragoScent;
    }
}
