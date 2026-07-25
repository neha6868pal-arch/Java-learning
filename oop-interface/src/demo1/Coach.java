package demo1;

public abstract class Coach extends person{
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }
    public abstract void teatch();
}
