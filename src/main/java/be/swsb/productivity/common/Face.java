package be.swsb.productivity.common;

public class Face {
    private int eyes;
    private String color;
    private int nosewidth;

    public Face(int eyes, String color, int nosewidth) {
        this.eyes = eyes;
        this.color = color;
        this.nosewidth = nosewidth;
    }

    public int getEyes() {
        return eyes;
    }

    public String getColor() {
        return color;
    }

    public int getNosewidth() {
        return nosewidth;
    }
}
