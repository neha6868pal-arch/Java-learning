public class demo {
    public static void main(String[] args){
        System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        int []nums = {2,7,11,15};
        int target = 9;
        int [] arr = new int [2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
