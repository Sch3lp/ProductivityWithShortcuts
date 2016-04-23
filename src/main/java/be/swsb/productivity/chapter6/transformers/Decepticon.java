package be.swsb.productivity.chapter6.transformers;

public class Decepticon {
    private DecepticonEnum type;

    public Decepticon(DecepticonEnum type) {
        this.type = type;
    }

    public static DecepticonEnum galvatronEnum(){
        return DecepticonEnum.GUN;
    }
}
