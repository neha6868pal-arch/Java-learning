public class test {
   public static void main(String[] args){
       Person p = new Person("wang",20);
       Animal dog = new Dog(2,"黄棕");
       p.keepPet(dog,"骨头");

       Person p2 = new Person("Li",20);
       Animal cat = new Cat(2,"灰");
       p2.keepPet(dog,"鱼");
   }
}
