public class demoRecursion {
    public static void main(String[] args){
        System.out.println(getSum(5));
    }

    private static int  getSum(int number) {
        if (number == 1){
            return 1;
        }
        return number*getSum(number-1);
    }

}
