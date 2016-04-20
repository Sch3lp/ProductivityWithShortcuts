package be.swsb.productivity.chapter2;

public class JumperStrategyFactory {

    public static Jumper epicJumperStrategy() {
        return new EpicJumper();
    }

    public static Jumper mehJumperStrategy() {
        return new MehJumper();
    }
}
