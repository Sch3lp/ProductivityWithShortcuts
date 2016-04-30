package be.swsb.productivity.chapter2.mud.domain;

public class Ball {
    private final String id;
    private final int size;

    public Ball(String id, int size) {
        this.id = id;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public void bounce(){
        System.out.println("bounce");
    }

    public void smash(){
        System.out.println("smash");
    }

    public void hit(){
        System.out.println("hit");
    }

    public void dribble(){
        System.out.println("dribble");
    }

    public void kick(){
        System.out.println("kick");
    }

    public void shoot(){
        System.out.println("shoot");
    }

    public void throwww(){
        System.out.println("throwww");
    }

    public void squeeze(){
        System.out.println("squeeze");
    }

    public void roll(){
        System.out.println("roll");
    }

    public void destroy(){
        System.out.println("destroy");
    }

    public void collect(){
        System.out.println("collect");
    }

    public void launch(){
        System.out.println("launch");
    }

    public void drizzle(){
        System.out.println("drizzle");
    }

    public void hoop(){
        System.out.println("hoop");
    }

    public void net(){
        System.out.println("net");
    }

    public void score(){
        System.out.println("score");
    }

    public void supersmash(){
        System.out.println("supersmash");
    }

    public void assemble(){
        System.out.println("assemble");
    }

    public void complete(){
        System.out.println("complete");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (size != ball.size) return false;
        return id != null ? id.equals(ball.id) : ball.id == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + size;
        return result;
    }
}
