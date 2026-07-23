package demo2;

public class mansger extends employee{
    String manage;

    public mansger() {
        super();
    }

    public mansger(String id, String name, String wage, String manage) {
        super(id, name, wage);
        this.manage = manage;
    }

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage;
    }
    @Override
    public void work(){
        System.out.println(name+"管理其他人");
    }
}
