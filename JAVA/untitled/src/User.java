public class User {
    private String name;
    private String password;
    private String id;
    private int phonenumber;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public User(String name, String password, String id, int phonenumber) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.phonenumber = phonenumber;
    }
}
