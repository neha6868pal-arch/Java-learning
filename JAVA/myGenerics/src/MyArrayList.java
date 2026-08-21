public class MyArrayList <E>{
    Object[] obj = new Object[10];
    int size;

    public void add(E e) {
        if (size == obj.length) {
            Object[] newobj = new Object[obj.length * 2];
            System.arraycopy(obj, 0, newobj, 0, obj.length);
            obj = newobj;
        }
        obj[size] = e;
        size++;
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "obj=" + java.util.Arrays.toString(obj) +
                ", size=" + size +
                '}';
    }
}
