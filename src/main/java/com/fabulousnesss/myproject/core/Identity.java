package main.java.com.fabulousnesss.myproject.core;

public abstract class Identity implements Identifiable {
    private int id;

    @Override
    public String toString() {
        return "Identity{" +
                "id=" + id +
                '}';
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void print() {
        System.out.println(this.toString());
    }
}
