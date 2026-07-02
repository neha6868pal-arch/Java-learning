public class gameTest {
    public static void main(String[] args) {
        Role r1 = new Role("不知火", 100,'女');
        Role r2 = new Role("八岐大蛇", 100,'男');
        r1.show();
        r2.show();
        //不知道多少论，所以先无限循环
        while (true) {
            r1.attack(r2);
            if (r2.getHP()==0) {
                System.out.println("八岐大蛇阵亡");
                break;
            }
            r2.attack(r1);
            if (r1.getHP()==0) {
                System.out.println("不知火阵亡");
                break;
            } 
        }//我开始把攻击写一块了，而且就一个if判定
        //他俩血量都不为0，就会继续互攻
        //在这个过程如果都死，不管谁先死都是if最先判定的那个阵亡

        //现在就是回合制，先手和后手
        //死亡的判定在对方攻击之前
    }
}
