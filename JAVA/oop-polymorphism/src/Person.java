public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void keepPet(Animal ani,String sth){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+ani.getColor()+"颜色的"+ani.getAge()+"岁的狗");
        ani.eat(sth);
    }
}
