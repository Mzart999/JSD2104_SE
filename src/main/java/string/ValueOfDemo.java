package string;

/**
 * String提供了一组静态的重载方法:valueOf,作用是将其他类型转换为字符串
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int i = 123;
        String s1 = String.valueOf(i);
        System.out.println(s1);

        double dou =123.123;
        String s2 = String.valueOf(dou);
        System.out.println(s2);

        s1 = i + "";//任何内容于字符串连接结果都是字符串，但性能不如上面的
        System.out.println(s1);
    }
}
