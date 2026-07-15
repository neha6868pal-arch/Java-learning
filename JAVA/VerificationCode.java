import java.util.Random;

public class VerificationCode {
    public static void main(String[] args){
      //生成长度为5、内容四位字母一位数字（位置随机）的验证码
        Random r = new Random();
        char [] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i<=25){
                arr[i] = (char) (i+97);
            }else {
                arr[i] = (char)(i+65-26);
            }
        }
//        char letters[52];
//        int i = 0;
//        for(char c='a'; c<='z'; c++){
//            letters[i++] = c;
//        }
//        for(char c='A'; c<='Z'; c++){
//            letters[i++] = c;
//        }
        char [] code = new char[5];
        for (int i = 0; i < code.length; i++) {
            int index = r.nextInt(arr.length);
            code[i] = arr[index];
        }
        int index = r.nextInt(code.length);
        int num = r.nextInt(10);
        code[index] = (char) (num+48);
        String result = new String(code);
        System.out.println(result);
    }
}
