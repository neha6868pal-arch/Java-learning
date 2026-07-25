package demo1;

public class PinpongAthelte extends Athelete implements English{
    public PinpongAthelte(String name, int age) {
        super(name, age);
    }

    public PinpongAthelte() {
    }

    @Override
    public void learn() {
        System.out.println("学乒乓");
    }
}
