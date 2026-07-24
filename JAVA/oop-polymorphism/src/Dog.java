public class Dog extends Animal{
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }
    @Override
    public void eat(String sth){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住"+sth+"猛吃");
    }
    public void lookHouse(){
        System.out.println("看家");
    }
}
