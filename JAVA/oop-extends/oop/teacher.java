package oop;

public class teacher extends Person {
    @Override
    public void show(){
        System.out.println("老师的信息为："+getName()+","+getAge());
    }
}
