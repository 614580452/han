package string;

/**
 * String toLowerCase()
 * 将当前字符串中的英文部分转换成小写
 *
 * String   ToupperCase()
 *  将当前字符串中的英文部分转换成小写
 */
public class ToupperCaseDemo {
    public static void main(String[] args) {
        String str ="我爱java";
        System.out.println(str);

        String upper=str.toUpperCase();
        System.out.println(upper);

        String lower =str.toLowerCase();
        System.out.println(lower);
    }
}
