public class Cat extends Animal {

    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }
    @Override
    public void eat(String sth){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛侧着头吃"+sth);
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
