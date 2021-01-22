package string;

import javax.print.DocFlavor;

/**
 * 字符串常量池是JVM在 堆内存中专门位字符串提供的一段空间，用于缓存所有使用字面量形式
 * 创建的字符串对象，当再次使用相同字面量创建字符串时会直接用常量池中的对象而不会再次创建新的对象减少缓存的开销
 */
public class stringDemo {
    public static void main(String[] args) {
        String s1 ="123abc";
        System.out.println("s1:"+s1);
        //s2字面量于s1相同，因此重用了上面的s1船舰的字符串对象
        String s2 ="123abc";
        System.out.println("s2"+s2);
        System.out.println(s1==s2);//s1==s2为true,说明保存地址一样，使用的同一个对象

        String s3=new String("123abc");
        System.out.println("s3:"+s3);
        System.out.println(s2.equals(s3));//s2==s3为true，比较字符串的内容是否相同
        s1=s1+"！";
        System.out.println(s1);//s1内容发成改变
        System.out.println(s2);//s2没有发生改变
        System.out.println(s1==s2);//false.s1已经不再和s2指向同一个对象了

        /**
         * 编译器有一个特性
         * 当编译器在编译一段代码是大仙一个字算表达式可以在编译期间确定结果时就会进行计算，并将结果编译到class文件中，这样以来虚拟机运行该程序
         * 时就不必每次都进行行计算了
         * 下面的代码会被编译器改为：
         * String s4=”123abc“；
         */
        String s4 ="123"+"abc";



    }

}
