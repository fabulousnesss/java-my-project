package main.java.com.fabulousnesss.myproject;

public abstract class AbstractPrintable implements Identifiable {
    private int id;

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
