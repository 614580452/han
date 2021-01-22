package string;

/**
 * static String valueOf(XXX xxx)
 * String提供了一组重载的静态方法:valueOf,作用将java中其中其他类型转换成String
 *
 */
public class ValueOfDeno {
    public static void main(String[] args) {
        int i =123;
        String str =String.valueOf(i);
        System.out.println(str);

        String s3=i+"";
        System.out.println(s3);
    }
}
