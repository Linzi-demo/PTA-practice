package com.grove;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * 写出这个数
 *
 * 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 * 输入格式：
 * 每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10^100
 * 输出格式：
 * 在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。
 */
public class WriteThisNum_10002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal bigDecimal = scanner.nextBigDecimal();
        String str = bigDecimal.toString();
        int sum = 0;
        for(int i=0;i<str.length();i++){
            sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        String[] arr = new String[]{"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        String result = "";
        while (sum!=0){
            result = " "+arr[sum%10]+result;
            sum = sum/10;
        }
        System.out.printf(result.substring(1));

    }
}
