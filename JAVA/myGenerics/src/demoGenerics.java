public class demoGenerics {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        System.out.println(list);
    }
}
