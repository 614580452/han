package string;

/**
 * int IndexOf(String str)
 * 返回给定字字符串在当前字符串的位置，如果当前字符串不包含给定内容则返回值为-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        //           0123456789012345
        String str ="thinking in java";
        int index =str.indexOf("in");//检测str中第一次出现in的位置
        System.out.println(index);//2

        index=str.indexOf("in",3);//从下标3处开始寻找第一次出现in的位置
        System.out.println(index);//5
        //检查最后一次出现给定字符串的位置
        index=str.lastIndexOf("in");//最后一次in出现的位置
        System.out.println(index);//9

    }
}
