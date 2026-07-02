import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Random;

public class Role {
    private String name;
    private int healthPoint;
    private char gender;
    private String face;//根据性别随机。所以不输入，在原来输入外界值的地方，改写成要求
    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};
//成员变量都写这，数组也是变量。写在这就可以全局直接用
    String[] attacks_desc={
    "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
    "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
    "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
    "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
    "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
    "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    String[] injureds_desc={
    "结果%s退了半步，毫发无损",
    "结果给%s造成一处瘀伤",
    "结果一击命中，%s痛得弯下腰",
    "结果%s痛苦地闷哼了一声，显然受了点内伤",
    "结果%s摇摇晃晃，一跤摔倒在地",
    "结果%s脸色一下变得惨白，连退了好几步",
    "结果『轰』的一声，%s口中鲜血狂喷而出",
    "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role(){}

    public Role(String name,int healthPoint,char gender){
        this.name = name;
        this.healthPoint = healthPoint;
        this.gender = gender;
        setFace(gender);//因为一般都用这个构造，如果不在这里面就需要额外再用set
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void sethp(int healthPoint){
        this.healthPoint = healthPoint;
    }
    public int getHP(){
        return healthPoint;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }
    public void setFace(char gender){
        Random r = new Random();
        if (gender=='男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if (gender=='女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else{
            this.face = "无面人";
        }
    }
    public String getFace(){
        return face;
    }
    //肯定不能只存成员变量，还有他们要用的方法，
    //就是这块不会，因为一个对象就在自己这块，如何做用到另一个对象
    //对象去用方法攻击另一个对象(即参数)
    //把另一个对象当参数引用
    //因为是并列的，参数都要用到，所以直接引用这个类，剩下的就是形参名字
    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String kunfu = attacks_desc[index];
        System.out.printf(kunfu, this.getName(),role.name);
        System.out.println();
        int harm = r.nextInt(20)+1;
        int remain = role.healthPoint -harm;
        remain = remain<0?0:remain;//前面定义过的在三元运算符这就不用再定义了
        //因为这是局部变量，所以要用set返回值
        role.sethp(remain);
        System.out.println("造成"+harm+"点伤害，"+role.getName()+"剩余"+role.getHP()+"血量。");
        // int index2 = r.nextInt(injureds_desc.length);
        // String injures = injureds_desc[index2];
        // System.out.printf(injures,role.getName());
        if (remain>90) {//根据血量描述，更好修改
            System.out.printf(injureds_desc[0],role.getName());
        }else if (remain>80&&remain<=90) {
            System.out.printf(injureds_desc[1],role.getName());
        }else if (remain>70&&remain<=80) {
            System.out.printf(injureds_desc[2],role.getName());
        }else if (remain>60&&remain<=70) {
            System.out.printf(injureds_desc[3],role.getName());
        }else if (remain>40&&remain<=60) {
            System.out.printf(injureds_desc[4],role.getName());
        }else if (remain>20&&remain<=40) {
            System.out.printf(injureds_desc[5],role.getName());
        }else if (remain>0&&remain<=20) {
            System.out.printf(injureds_desc[6],role.getName());
        }else {
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();
    }
    public void show(){
        System.out.println("姓名为"+getName());
        System.out.println("血量为"+getHP());
        System.out.println("性别为"+getGender());
        System.out.println("长相为"+getFace());
    }
}
