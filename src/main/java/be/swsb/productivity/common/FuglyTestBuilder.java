package be.swsb.productivity.common;

public class FuglyTestBuilder {

    private String eff;
    private String yew;
    private String gee;
    private String el;
    private String why;
    private Face face;

    public static FuglyTestBuilder fugly(){
        return new FuglyTestBuilder();
    }

    private FuglyTestBuilder(){}

    public AFugly build(){
        return new AFugly(eff, yew, gee, el, why, face);
    }

    public FuglyTestBuilder withEff(String eff) {
        this.eff = eff;
        return this;
    }

    public FuglyTestBuilder withYew(String yew) {
        this.yew = yew;
        return this;
    }

    public FuglyTestBuilder withGee(String gee) {
        this.gee = gee;
        return this;
    }

    public FuglyTestBuilder withEll(String el) {
        this.el = el;
        return this;
    }

    public FuglyTestBuilder withWhy(String why) {
        this.why = why;
        return this;
    }

    public FuglyTestBuilder withFace(Face face) {
        this.face = face;
        return this;
    }
}
