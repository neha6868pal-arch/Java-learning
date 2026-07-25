package demo1;

public class basketballAthelete extends Athelete{
    public basketballAthelete(String name, int age) {
        super(name, age);
    }

    public basketballAthelete() {
    }

    @Override
    public void learn() {
        System.out.println("学篮球");
    }
}
