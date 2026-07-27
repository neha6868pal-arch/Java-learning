package com.itheima;

import java.util.Random;

public class test {
    public static void main(String[] args){
      //打乱一维数组，并按照4个一组的方式添加到二位数组中
        Random r = new Random();
        int[] arr ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(16);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        int number = 0;
        int [][] result = new int[4][4];
        for (int i = 0; i < result.length; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                result[i][i1] = arr[number];
                number++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                System.out.print(result[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
