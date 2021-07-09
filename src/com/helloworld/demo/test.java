package com.helloworld.demo;



/**
 * 编号 2
 * 常用运算符Demo
 * @author 马云飞
 * @data 2021/1/22 19:13
 */
public class test {
	public static void main(String[] args){

		/**
         * 第一部分：基础运算符
         * =、+、-、*、/、%、()
         * 基本运算符，和数学里的基本运算一样，优先级也一样
         * 运算时类型转换法则：
         * 法则一：相同类型的数据做运算，结果也是相同类型的数据；
         * 法则二：不同类型的数据做运算，会把数据范围小的类型自动转换成数据类型大的类型，再做运算；
         */

        // 等号=，用于赋值运算，把右边的值或者右边表达式的值赋值给左边的变量
        int a1 = 1;         // 把数字1赋值给变量a1，执行之后变量a1就为整型数字1
        String a2 = "2";    // 把字符串“2”赋值给变量a2，执行之后变量a2就为字符串“2”
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("------------------------------");

        //加号+，作用1：对两个数字求和相加；作用2：对两个字符串进行拼接；
        int b1 = 1 + 2;         // 数字 + 数字 = 数字之和，基本的加法运算，即 1 + 1 = 2
        String b2 = 1 + "2";    // 数字 + 字符串 = 字符串 + 字符串 = 连接两个字符串，即 1 + "2" = "1" + "2" = “12”
        String b3 = "1" + "2";  // 字符串 + 字符串 = 连接两个字符串，即 "1" + "2" = "12"
        System.out.println("1 + 2 = " + b1);
        System.out.println("1 + \"2\" = " + b2);
        System.out.println("\"1\" + \"2\" = " + b3);
        System.out.println("------------------------------");

        //减号-，对两个数字做减法运算
        int c1 = 6 - 2;     // 减号左边的数字减去右边的数字，加号数字求和的反向运算
        int c2 = 7 - 9;     // 较小的数减去较大的数会得负数，基本的减法运算；
        System.out.println("6 - 2 = " + c1);
        System.out.println("7 - 9 = " + c2);
        System.out.println("------------------------------");

        //星号*，对两个数字做乘法运算，运算优先级大于加号和减号
        int d1 = 6 * 2;     // 星号两边的数字相乘，基本的乘法运算
        int d2 = 7 * -9;    // 正数乘负数得负数，基本乘法法则
        System.out.println("6 * 2 = " + d1);
        System.out.println("7 * -9 = " + d2);
        System.out.println("------------------------------");

        //斜杠/，对两个数做除法运算，运算优先级大于加号和减号
        int e1 = 9 / 3;         // 斜杠前面的是被除数，斜杠后面的是除数，基本除法运算
        int e2 = 8 / 3;         // 注意：整型除整型结果也是整型，所以整型做除法会丢失小数
        double e3 = 8.0 / 3;    // 注意：浮点型除整型结束会是浮点型，不会丢失小数；
        System.out.println("9 / 3 = " + e1);
        System.out.println("8 / 3 = " + e2);
        System.out.println("8.0 / 3 = " + e3);
        System.out.println("------------------------------");

        //百分号%，对两个数做求余运算，运算优先级大于加号和减号
        int f1 = 9 % 3;     // 百分号前面是被除数，后面是除数，算出来的是余数
        int f2 = 8 % 3;     // 求余运算只能用于整型
        System.out.println("9 % 3 = " + f1);
        System.out.println("8 % 3 = " + f2);
        System.out.println("------------------------------");

        //括号()，提升计算优先级，和数学基本运算法则一样
        int g1 = 1 + 2 * 3 + 4 ;    // 先计算乘除，再计算加减
        int g2 = (1 + 2) * (3 + 4); // 有括号的，先计算括号内的
        System.out.println("1 + 2 * 3 + 4 = " + g1);
        System.out.println("(1 + 2) * (3 + 4) = " + g2);
        System.out.println("==============================");

        /**
         * 第二部分：特殊运算符
         * ++、--、+=、-=、*=、/=、%=
         */

        //自增运算符++，对整型数据进行+1；
        int h1 = 1;
        int h2 = ++h1;  // 作用1：放在整型变量前面时，先进性自增运算再使用该变量；
        int h3 = 1;
        int h4 = h3++;  // 作用2：放在整型变量后面时，先使用该变量再进行自增运算；
        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
        System.out.println("h3 = " + h3);
        System.out.println("h4 = " + h4);
        System.out.println("------------------------------");

        //自减运算符--，对整型数据进行-1；
        int i1 = 1;
        int i2 = --i1;  // 作用1：放在整型变量前面时，先进性自减运算再使用该变量；
        int i3 = 1;
        int i4 = i3--;  // 作用2：放在整型变量后面时，先使用该变量再进行自减运算；
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("------------------------------");

        //运算加赋值，只是省略了左侧变量，和正常计算一样；
        int j1 = 2;
        int j2 = 2;
        int j3 = 2;
        int j4 = 2;
        int j5 = 2;
        j1 += 2;    // 等效于 j1 = j1 + 2;
        j2 -= 2;    // 等效于 j2 = j2 - 2;
        j3 *= 2;    // 等效于 j3 = j3 * 2;
        j4 /= 2;    // 等效于 j4 = j4 / 2;
        j5 %= 2;    // 等效于 j5 = j5 % 2;
        System.out.println("j1 = " + j1);
        System.out.println("j2 = " + j2);
        System.out.println("j3 = " + j3);
        System.out.println("j4 = " + j4);
        System.out.println("j5 = " + j5);
        System.out.println("==============================");

        /**
         * 第三部分：逻辑运算符
         * >、<、>=、<=、==、!=、!、&&、||
         * 逻辑运算用于判断条件的真假，即对错
         */

        //大于>和小于<运算符，比较左右两个数或者表达式的结果
        boolean k1 = 1 > 2;     // 1 > 2 是不成立的，也就是错的，即为假，false
        boolean k2 = 1 < 2;     // 1 < 2 是成立的，也就是对的，即为真，true
        boolean k3 = 1 < 1;     // 1 < 1 不成立，false
        System.out.println("1 > 2 = " + k1);
        System.out.println("1 < 2 = " + k2);
        System.out.println("1 < 1 = " + k3);
        System.out.println("------------------------------");

        //大于等于>=和小于等于<=运算符，比较左右两个数或者表达式的结果
        boolean l1 = 1 >= 2;    // 1 >= 2 不成立，false
        boolean l2 = 1 <= 2;    // 1 <= 2 成立，true
        boolean l3 = 1 <= 1;    // 1 <= 1 成立，true
        System.out.println("1 >= 2 = " + l1);
        System.out.println("1 <= 2 = " + l2);
        System.out.println("1 <= 1 = " + l3);
        System.out.println("------------------------------");

        //双等号==运算符，判断是否相等，作用1：基本类型使用双等号是判断值是否相等；作用2：对象使用双等号是判断两个对象是否是同一个，作用2作为了解，后面才会用到
        boolean m1 = 1 == 1;    // 判断1是否等于1，显而易见是对的，结果为真，true
        boolean m2 = 89 == -89; // 判断89是否等于-89，一正一负显然不相等，结果为假，false
        //不等于运算符!=，判断是否不等，作用1：基本类型使用不等号是判断值是否不等；作用2：对象使用不等号是判断两个对象是否不是同一个，作用2作为了解，后面才会用到
        boolean m3 = 1 != 1;    // 判断1是否不等于1，1肯定是等于1的，所以错，结果为假，false
        boolean m4 = 89 != -80; // 判断89是否不等于-89，判断成立，结果为真，true
        System.out.println("1 == 1 = " + m1);
        System.out.println("89 == -89 = " + m2);
        System.out.println("1 != 1 = " + m3);
        System.out.println("89 != -80 = " + m4);
        System.out.println("------------------------------");

        // 感叹号!，读作非；非运算符，对布尔结果取反，!true等于false，!false等于true;
        boolean n1 = !true;     // 对true做非运算，结果为false
        boolean n2 = !false;    // 对false做非运算，结果为true
        boolean n3 = !!false;   // 对false做非运算，再做非运算，相当于!(!false) -》 !(true) -》 false
        boolean n4 = !!!false;  // 相当于!(!(!false)) -》 !(!(true)) -》 !(false) -》 true
        boolean n5 = !(1 > 2);  // 1 > 2 为false，!(1 > 2) 就等于!false，就等于true
        System.out.println("!true = " + n1);
        System.out.println("!false = " + n2);
        System.out.println("!!false = " + n3);
        System.out.println("!!!false = " + n4);
        System.out.println("!(1 > 2) = " + n5);
        System.out.println("------------------------------");

        // 双and符&&，读作且；且运算符，两边的结果都为true时，结果才为true，其他全为false；
        boolean o1 = true && true;      // 两边都为true，结果为true；
        boolean o2 = true && false;     // 只有一个为true，结果为false；
        boolean o3 = false && false;    // 两个都为false，结果为false；
        boolean o4 = 1 < 2 && 2 < 3;    // 1 < 2为true，2 < 3也为true，结果为true；
        boolean o5 = 1 < 2 && 2 > 3;    // 1 < 2为true，2 > 3为false，结果为false；
        System.out.println("true && true = " + o1);
        System.out.println("true && false = " + o2);
        System.out.println("false && false = " + o3);
        System.out.println("1 < 2 && 2 < 3 = " + o4);
        System.out.println("1 < 2 && 2 > 3 = " + o5);
        System.out.println("------------------------------");

        // 双竖线||，读作或；或运算符，两边任意一个结果为true，结果就是true，两个全为false时，结果才为false；
        boolean p1 = true || true;      // 两边都是true，结果为true
        boolean p2 = true || false;     // 有一个为true，结果为true
        boolean p3 = false || false;    // 两个都为false，结果为false
        boolean p4 = 1 < 2 || 2 < 3;    // 1 < 2为true，2 < 3也为true，结果为true；
        boolean p5 = 1 < 2 || 2 > 3;    // 1 < 2为true，2 > 3为false，有一个为true，结果任然为true；
        System.out.println("true || true = " + p1);
        System.out.println("true || false = " + p2);
        System.out.println("false || false = " + p3);
        System.out.println("1 < 2 || 2 < 3 = " + p4);
        System.out.println("1 < 2 || 2 > 3 = " + p5);
        System.out.println("==============================");

        /**
         * 第四部分：三目运算符
         * ?:
         * 根据判断条件选择结果值
         */

        // 由问号?和冒号:组成，问号?前面的为判断条件，结果为布尔型，若结果为true，取冒号:前面的值，若结果为false，取冒号:后面的值
        int q1 = 1 < 2 ? 1 : 2;     // 1 < 2 为true，取冒号前面的值，也就是1，赋值给变量q1；
        int q2 = 1 > 2 ? 1 : 2;     // 1 > 2 为false，取冒号后面的值，就是2，赋值给变量q2；
        System.out.println("1 < 2 ? 1 : 2 = " + q1);
        System.out.println("1 > 2 ? 1 : 2 = " + q2);
        System.out.println("==============================");

        /**
         * 第五部分：位运算符
         * &、|、^、~、>>、<<、>>>、&=、|=、^=、>>=、<<=、>>>=
         * 位运算符是对数据的字节码做运算操作，也就是二进制的数据做操作
         */
        // 暂时不用深究，按书上的读一遍有个印象即可；
    }

}

