package be.swsb.productivity.chapter6;

import be.swsb.productivity.chapter6.transformers.Autobot;
import be.swsb.productivity.chapter6.transformers.AutobotEnum;
import be.swsb.productivity.chapter6.transformers.Decepticon;
import be.swsb.productivity.chapter6.transformers.DecepticonEnum;

public class Transformers {

    public void disguise() {
        Autobot optimus = new Autobot(AutobotEnum.CAR);
        Decepticon galvatron = new Decepticon(DecepticonEnum.JET);

        optimus.catchPhrase("Autobots!");
    }
}
