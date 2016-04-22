package be.swsb.productivity.chapter5;

import be.swsb.productivity.chapter5.beans.MaragoBeans;
import be.swsb.productivity.chapter5.beans.YrgacheffeBeans;

public class Chapter5 {

    public String smellBeans() {
        return new CoffeeSmeller().smell(new MaragoBeans(), new YrgacheffeBeans(), new MaragoBeans());
    }
}
