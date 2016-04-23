package be.swsb.productivity.chapter6.transformers;

public class Autobot {

    private AutobotEnum type;

    public Autobot(AutobotEnum type) {
        this.type = type;
    }

    public static AutobotEnum optimusEnum(){
        return AutobotEnum.CAR;
    }

    public String catchPhrase(String prefix) {
        return String.format("%s Rollout!", prefix);
    }
}
