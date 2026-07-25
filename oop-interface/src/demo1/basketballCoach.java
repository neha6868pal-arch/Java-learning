package demo1;

public class basketballCoach extends Coach{
    public basketballCoach(String name, int age) {
        super(name, age);
    }

    public basketballCoach() {
    }

    @Override
    public void teatch() {
        System.out.println("教篮球");
    }
}
