package com.example.lib.JavaHomework.Common;

import java.util.Arrays;
import java.util.Scanner;

public class test_6 {
    public static void main(String[] args) {
        //使用随机数生成十个整数（0--99）保存在一个数组中，然后使用数组实用类，将数组元素复制到另外一个数组
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] b = a.clone();
        //将数组元素进行排序
        System.out.println("排序后");
        Arrays.sort(b);
        for (int aB : b) {
            System.out.print(aB+" ");
        }
        //将数组元素进行排序；输入一个数值，再查找该数在数组中哪个位置
        System.out.println("\n请输入查找值：");
        Scanner scanner = new Scanner(System.in);
        if (Arrays.binarySearch(b, scanner.nextInt()) < 0) {
            System.out.println("元素不存在");
        } else {
            System.out.println("元素位置："+Arrays.binarySearch(b,scanner.nextInt()));
        }


    }

}
