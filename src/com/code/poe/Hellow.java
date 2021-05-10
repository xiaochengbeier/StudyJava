package com.code.poe;

public class Hellow {
    public static void main(String[] args) {
         // 在java中随便给一个整数数字如果不申明类型则他是int类型
         int a = 1024;
         // 如果是long类型可以用 l 显示的申明表示告诉编译器
         long b = 1023;
         long g = 4l;
         // 语法错误
         int c = 2l;

         // byte short 编译器会校验值
         byte m = 10;
         // 1024 超过byte 范围 -128 - 127
         byte x = 1024;
         byte f = 127;
         byte n = -128;
         short y = 1024;

         //  在java中随便给一个小数默认为 double类型
         float f1 = 100.234;
         float f2 = 100.234f;

         // char 类型可以和int 相互转换
         char c2 = 100;
         int  c3 =  'A';
         int  c4 = c2 + c3;
         char c1 = '\t';

         // 低精度可以自动转换为高精度
         byte b1 = 127;
         double d1 = b1;

         // 高精度可以强转为低精度但是会丢失进度
         byte b2 = (byte) d1;
         double d2 = 3.1417926;
         int i3 = (char)d2;


    }
}
