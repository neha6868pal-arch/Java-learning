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
    public void keepPet(Animal a,String sth){
        if (a instanceof Dog d){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的狗");
            a.eat(sth);
        }else if (a instanceof Cat c){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的猫");
            a.eat(sth);
        }

    }
}
