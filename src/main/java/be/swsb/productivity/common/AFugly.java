package be.swsb.productivity.common;


public class AFugly {
    private String eff;
    private String yew;
    private String gee;
    private String el;
    private String why;
    private Face face;

    AFugly(String eff, String yew, String gee, String el, String why, Face face) {
        this.eff = eff;
        this.yew = yew;
        this.gee = gee;
        this.el = el;
        this.why = why;
        this.face = face;
    }

    public String getEff() {
        return eff;
    }

    public String getYew() {
        return yew;
    }

    public String getGee() {
        return gee;
    }

    public String getEl() {
        return el;
    }

    public String getWhy() {
        return why;
    }

    public Face getFace() {
        return face;
    }
}
