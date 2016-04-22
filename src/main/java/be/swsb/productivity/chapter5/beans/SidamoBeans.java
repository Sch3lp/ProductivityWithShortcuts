package be.swsb.productivity.chapter5.beans;

public class SidamoBeans extends CoffeeBeans {
    private String sidamoScent = "sidamo";

    @Override
    public String scent() {
        return sidamoScent;
    }
}
