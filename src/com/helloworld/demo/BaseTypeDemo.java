package com.helloworld.demo;

public class BaseTypeDemo {

    public static void main(String[] args){

        /**
         * 1、byte 字节型，包装型为Byte
         * 长度为1个字节，能表示范围很小的整数
         * 一般作为数组来用，用来操作字节流
         */
        byte a1 = 1;
        byte a2 = 0;
        byte a3 = -1;
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("byte位数 = " + Byte.SIZE);
        System.out.println("byte最大值 = " + Byte.MAX_VALUE);
        System.out.println("byte最小值 = " + Byte.MIN_VALUE);
        System.out.println("****************【Byte结束】****************");

        /**
         * 2、short 短整型，包装型为Short
         * 长度为2个字节，能表示的数字范围比byte大，比int小，只能表示整数
         * 一般很少使用
         */
        short b1 = 8;
        short b2 = 0;
        short b3 = -8;
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("short位数 = " + Short.SIZE);
        System.out.println("short最大值 = " + Short.MAX_VALUE);
        System.out.println("short最小值 = " + Short.MIN_VALUE);
        System.out.println("****************【Short结束】****************");
        
        /**
         * 3、int 整型，包装型为Integer
         * 长度为4个字节，能表示的数字范围比long小，比short大，只能表示整数
         * 很常用，一般程序里的整数都是使用的int
         */
        int c1 = 123;
        int c2 = 0;
        int c3 = -123;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("int位数 = " + Integer.SIZE);
        System.out.println("int最大值 = " + Integer.MAX_VALUE);
        System.out.println("int最小值 = " + Integer.MIN_VALUE);
        System.out.println("****************【Integer结束】****************");

        /**
         * 4、long 长整型，包装型为Long
         * 长度为8个字节，能表示的范围比int大，只能表示整数，是基本类型里最大的整数类型
         * 也较为常用，一般在数据有较大的整数时使用
         * long数字一般要带L，比如1L、89L，不带L的数字默认为整型，把整型赋值给long时会自动转换为long
         */
        long d1 = 123;      // 整型int自动转换成长整型long
        long d2 = 123456L;
        long d3 = -9765443321L;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("long位数 = " + Long.SIZE);
        System.out.println("long最大值 = " + Long.MAX_VALUE);
        System.out.println("long最小值 = " + Long.MIN_VALUE);
        System.out.println("****************【Long结束】****************");

        /**
         * 5、float 单精度浮点型，包装型为Float
         * 长度为4个字节，用来表示小数
         * 比较常用，一般用在精确度不要求很高的小数上
         * 定义float数据要加F，不加F会报错，因为不加F的小数默认为double类型，double类型数据长度比float长，所以double不能自动转换为float
         * 整型int和长整型long可以自动转换成float
         */
        float e1 = 123;     // 整型int自动转换成单精度浮点型float
        float e2 = 123456L; // 长整型long自动转换成单精度浮点型float
        float e3 = 0.123456F;
        float e4 = -584.254F;
        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
        System.out.println("e3 = " + e3);
        System.out.println("e4 = " + e4);
        System.out.println("float位数 = " + Float.SIZE);
        System.out.println("float最大值 = " + Float.MAX_VALUE);
        System.out.println("float最小值 = " + Float.MIN_VALUE);
        System.out.println("****************【Float结束】****************");

        /**
         * 6、double 双精度浮点型，包装型为Double
         * 长度为8个字节，能表示的数据范围比float大，也用来表示小数
         * 比较常用，一般用在精度要求较高的小数上
         * 定义double数据可以加D也可以不加，加D和不加D的小数都默认为double类型
         * 整型int和长整型long可以自动转换成double，float也可以自动转换成double
         */
        double f1 = 123;        // 整型int自动转换成双精度浮点型double
        double f2 = 123456L;    // 长整型long自动转换成双精度浮点型double
        double f3 = 0.123456F;  // 单精度浮点型float自动转换成双精度浮点型double
        double f4 = 0.123456789;
        double f5 = 55562.145D;
        double f6 = -78165.148D;
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);
        System.out.println("f6 = " + f6);
        System.out.println("double位数 = " + Double.SIZE);
        System.out.println("double最大值 = " + Double.MAX_VALUE);
        System.out.println("double最小值 = " + Double.MIN_VALUE);
        System.out.println("****************【Double结束】****************");

        /**
         * 7、char 字符型，包装型为Character
         * 长度为2个字节，只能表示单个字符
         * 不常用，一般用在字符数组上，字符串类型内部就是一个字符数组
         * char可以当做数字来用，数值是该字符对应的编码值，如字符'1'的数值为49，应为字符'1'的编码值为49
         * 前127的编码值对应的字符可以参考ASCII码值表
         */
        char g1 = '6';
        char g2 = 'A';
        char g3 = '嘿';
        System.out.println("g1 = " + g1);
        System.out.println("g2 = " + g2);
        System.out.println("g3 = " + g3);
        System.out.println("char位数 = " + Character.SIZE);
        System.out.println("char最大值 = " + (int)Character.MAX_VALUE);
        System.out.println("char最小值 = " + (int)Character.MIN_VALUE);
        System.out.println("****************【Character结束】****************");

        /**
         * 8、boolean 布尔型，包装型为Boolean
         * 只有两个值 true 和 false，分别代表逻辑上的真和假
         */
        boolean h1 = true;
        boolean h2 = false;
        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
        System.out.println("boolean的真 = " + Boolean.TRUE);
        System.out.println("boolean的假 = " + Boolean.FALSE);
        System.out.println("****************【Boolean结束】****************");

        /**
         * 拓展1、String 字符串
         * 非基本类型，内部是字符型char数组
         * 非常非常常用，各种用法，能表示各种字符
         * 用来表示一段字符，比如:"ABCDEF"，"123456789"，"Hello World!"，"%#$^&UI)_UVFE#@%RGH59",“????▲▼●◆◇☆?★”
         */
        String i = "你好！Hello World！~！@#￥%……&*（）——+·-=【】、‘；。、????▲▼●◆◇☆?★，这不是乱码！";
        System.out.println("i = " + i);
        System.out.println("****************【String结束】****************");

        /**
         * 拓展2、数组
         * 任何基本类型和非基本类型都可以定义数组，数组就是一群相同类型的数据，
         * 如果把类型比作形状，数组就像一排相同形状的凹槽，每个凹槽内都可以放该形状的数据
         * 数组使用下标去取内部数据，第一个数据下标为0，第二个数据下标为1，以此类推
         */
        int[] j = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // 初始化一个长度为10的整型数组
        char[] k = {'H','e','l','l','o',' ','W','o','r','l','d','！'};   // 初始化一个长度为12的字符型数组
        int[] l = new int[2];   // 创建一个长度为2的整型数组，还未赋值
        l[0] = 5;   // 给整型数组l的第一位赋值为5
        l[1] = -9;  // 给整型数组l的第二位赋值为-9
        System.out.println("j[3] = " + j[3]);
        System.out.println("k[6] = " + k[6]);
        System.out.println("l[0] = " + l[0]);
        System.out.println("****************【数组结束】****************");
    }
}
