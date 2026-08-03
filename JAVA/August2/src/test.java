import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;

public class test {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            BigInteger bi = new BigInteger(4,new Random());
            System.out.println(bi);
        }
        BigInteger bi2 = new BigInteger("100");
        System.out.println(bi2);
    }
}
