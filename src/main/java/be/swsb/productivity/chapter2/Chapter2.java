package be.swsb.productivity.chapter2;

public class Chapter2 {

    public Chapter2() {
        String phrase = theQuickBrownFoxJumpedOverTheLazyCamel();
    }

    private String theQuickBrownFoxJumpedOverTheLazyCamel() {
        return "The quick brown fox jumped over the lazy camel";
    }

    private String fox() {
        return "The quick brown fox ";
    }

    private String jump(){
        return "jumped over ";
    }

    private String camel() {
        return "the lazy camel";
    }
}