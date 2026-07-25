package demo1;

public class pingpongCoach extends Coach implements English{
    public pingpongCoach(String name, int age) {
        super(name, age);
    }

    public pingpongCoach() {
    }

    @Override
    public void teatch() {
        System.out.println("教乒乓");
    }

    @Override
    public void english() {
        System.out.println("教英语");
    }
}
