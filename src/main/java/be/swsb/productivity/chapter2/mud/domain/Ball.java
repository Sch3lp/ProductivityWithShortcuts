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
}
