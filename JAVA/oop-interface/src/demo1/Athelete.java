package demo1;

public abstract class Athelete extends person{
    public Athelete(String name, int age) {
        super(name, age);
    }

    public Athelete() {
    }
    public abstract void learn();
}
