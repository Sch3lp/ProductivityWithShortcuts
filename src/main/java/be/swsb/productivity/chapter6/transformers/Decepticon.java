package be.swsb.productivity.chapter6.transformers;

public class Decepticon {
    private DecepticonEnum type;

    public Decepticon(DecepticonEnum type) {
        this.type = type;
    }

    public static DecepticonEnum megatronEnum(){
        return DecepticonEnum.GUN;
    }

    public static Decepticon StarScream(String name, String evilTrait, int numberOfLegs, int numberOfArms, double pctEvil, DecepticonEnum type) {
        return new StarScream(name, evilTrait, numberOfLegs, numberOfLegs, pctEvil, type);
    }

    public static Decepticon StarScream(String name, DecepticonEnum type) {
        return new StarScream(name, "backstabber", 2, 2, 99.99, type);
    }

    private static class StarScream extends Decepticon {
        private String name;
        private String evilTrait;
        private int numberOfLegs;
        private int numberOfArms;
        private double pctEvil;
        private int numberOfLegs1;

        private StarScream(String name, String evilTrait, int numberOfLegs, int numberOfArms, double pctEvil, DecepticonEnum type) {
            super(type);
            this.name = name;
            this.evilTrait = evilTrait;
            this.numberOfLegs = numberOfLegs;
            this.numberOfArms = numberOfArms;
            this.pctEvil = pctEvil;
        }

    }
}
