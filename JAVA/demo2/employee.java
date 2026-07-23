package demo2;

public class employee {
    String id;
    String name;
    String wage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public employee(String id, String name, String wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public employee() {
    }

    public void work(){
        System.out.println(name+"在工作");
    }
    public void eat(){
        System.out.println(name+"在吃米饭");
    }
}
