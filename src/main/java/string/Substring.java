package string;

/**
 * String Substring(int start,int end)
 * 截取指定范围的字符串，两个参数分别是范围对应的下标.
 * 注：在java API中通常使用两个数字表示范围是都是”含头不含尾“的
 */
public class Substring {
    public static void main(String[] args) {
        //           01234567890
        String host="www.tedu.cn";
        //截取域名
        String sub =host.substring(4,8);
        System.out.println(sub);

        //重载的Substring传入一个参数为：从指定位置截取到字符串的末尾
        sub=host.substring(4);
        System.out.println(sub);
    }
}
