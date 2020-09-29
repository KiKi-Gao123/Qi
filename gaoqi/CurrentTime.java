package gaoqi;

import java.util.Date;

public class CurrentTime {

    public static void main(String[] args) {
        //String,StringBuilder,StringBuffer时间比较
        //String
        String str = "";//创建新字符串
        long starTime = System.currentTimeMillis();//定义字符串执行操作的开始时间
        for(int i = 0;i<10000;i++) {//for循环
            str=str+i;//循环追加字符串
        }
        long endTime = System.currentTimeMillis();//定义字符串执行操作的结束时间
        long time = endTime - starTime;//计算对字符串操作前后的时间
        System.out.println("String的执行时间为："+time);//打印出结果

        //StringBuilder
        StringBuilder std = new StringBuilder();//创建字符串生成器
         starTime = System.currentTimeMillis();//定义字符串执行操作的开始时间
        for(int i = 0;i<10000;i++) {//for循环
            std.append(i);//循环追加字符串
        }
         endTime = System.currentTimeMillis();//定义字符串执行操作的结束时间
         time = endTime - starTime;//计算对字符串操作前后的时间
         System.out.println("StringBuilder的执行时间为："+time);//打印出结果

        //StringBuffer
        StringBuffer stb = new StringBuffer();//创建字符串生成器
         starTime = System.currentTimeMillis();//定义字符串执行操作的开始时间
        for(int i = 0;i<10000;i++) {//for循环
            stb.append(i);//循环追加字符串
        }
         endTime = System.currentTimeMillis();//定义字符串执行操作的结束时间
         time = endTime - starTime;//计算对字符串操作前后的时间
         System.out.println("StringBuffer的执行时间为："+time);//打印出结果
    }
}