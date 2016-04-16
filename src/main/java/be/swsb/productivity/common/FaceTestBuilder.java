package be.swsb.productivity.common;

public class FaceTestBuilder {
    private int eyes;
    private String color;
    private int nosewidth;

    public static FaceTestBuilder face(){
        return new FaceTestBuilder();
    }

    private FaceTestBuilder(){}

    public Face build(){
        return new Face(eyes, color, nosewidth);
    }

    public FaceTestBuilder withEyes(int eyes) {
        this.eyes = eyes;
        return this;
    }

    public FaceTestBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public FaceTestBuilder withNosewidth(int nosewidth) {
        this.nosewidth = nosewidth;
        return this;
    }
}
