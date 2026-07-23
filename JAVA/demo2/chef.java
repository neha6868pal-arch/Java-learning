package demo2;

public class chef extends employee{
    public chef() {
    }

    public chef(String id, String name, String wage) {
        super(id, name, wage);
    }
    @Override
    public void work(){
        System.out.println(name+"在炒饭");
    }
}
