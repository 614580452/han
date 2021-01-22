package string;

/**
 * boolean StartsWIth(String str)
 * 判断字符串是否是以给定的字符串开始的
 *
 * boolean endsWIth(String str)
 *  判断字符串是否是以给定的字符串结尾的
 */
public class StartsWIthDemo {
    public static void main(String[] args) {
        String str="www.tedu.cn";
//判断str是否以www开始的
        boolean starts=str.startsWith("www");
        System.out.println(starts);

        boolean ends=str.endsWith(".cn");
        System.out.println(ends);

    }
}
