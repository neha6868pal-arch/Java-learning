import java.util.Random;

public class certificationCode {
    public static void main(String[] args) {
        /*需求：​ 定义方法实现随机产生一个5位的验证码
        验证码格式：长度为5,前四位是大写字母或者小写字母,最后一位是数字*/ 
        //数就是基础类型，也是random已经写好的，只用random再加上范围
        //字母算引用数据类型，都可以放在数组里，然后随机索引来转换到数的随机
        //字母在数组里以字符的形式存在，最基本思考是把所有字母打下来
        Random r = new Random();
        //字符可以对应数字
        // ①找数字范围，赋值的时候强转成字母，适用于字母大小写分开
        // ②因为数可以加，正好字母是连续的，所以用循环的方式数累加，在这过程中强转为字母储存进数组
        char [] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){
                chs[i]=(char)(97+i);
            }else{
                chs[i]=(char)(65+i-26);//确保i在26位也是从0开始
            }
        }
        //随机到的可以赋值变量直接拼接,全是数的还是用数组，不用定义混合数组来存放再输出（搞复杂了）
        /*int number = r.nextInt(10);
        Object[] Code = new Object[5];
        Code[0]=chs[code(chs, r)];
        Code[1]=chs[code(chs, r)];
        Code[2]=chs[code(chs, r)];
        Code[3]=chs[code(chs, r)];
        Code[4]=number;
        for (int i = 0; i < Code.length; i++) {
            System.out.print(Code[i]);
        }*/
        int number = r.nextInt(10);
        String result = "";//代表什么都没有
        for (int i = 0; i <4; i++) {
            int index = r.nextInt(chs.length);
            result+=chs[index];
        }
        System.out.println(result+=number);
    }
    /*public static int code(char [] chs,Random r) {
        int index = r.nextInt(chs.length);//每次只生成一个数，
        //每个位置都随机，就要每个位置都用一次
        //高度重复所以存进方法里，每次引用方法就是再来一次
        return index;
    }*/
}
