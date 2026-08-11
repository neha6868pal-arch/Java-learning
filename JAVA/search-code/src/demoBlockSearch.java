
public class demoBlockSearch {
    public static void main(String[] args) {
        //扩展的分块查找（无规律的数据）
        int[] arr = {27,22,30,40,36,
                13,19,16,20,
                7,10
                ,43,50,48};
        block[] blocks = new block[4];
        blocks[0] = new block(22,40,0,4);
        blocks[1] = new block(13,20,5,8);
        blocks[2] = new block(7,10,9,10);
        blocks[3] = new block(43,50,11,12);
        int number = 22;
        int index = searchIndex(arr, blocks, number);
        System.out.println("The index of "+number+" is "+index);
    }

    private static int searchIndex(int[] arr, block[] blocks, int number) {
        int blockIndex = getBlockIndex(blocks, number);
        if (blockIndex == -1) {
            return -1;
        }
        int startIndex = blocks[blockIndex].getStartIndex();
        int endIndex = blocks[blockIndex].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    private static int getBlockIndex(block[] blocks, int number) {
        //不用二分法，因为块的顺序也无序
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].getMin() <= number && number <= blocks[i].getMax()) {
                return i;
            }
        }
        return -1;
    }

}

class block{
    int min;
    int max;
    int startIndex;
    int endIndex;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public block(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public block() {
    }
}