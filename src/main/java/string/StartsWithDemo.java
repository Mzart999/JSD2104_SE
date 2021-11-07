package string;

/**
 * boolean startWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否以给定的字符串开始或结尾的
 *
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String line = "http://www.tedu.cn";

        boolean starts = line.startsWith("http");
        System.out.println("starts:"+starts);

        boolean ends = line.endsWith(".com");
        System.out.println("ends:"+ends);
    }
}
