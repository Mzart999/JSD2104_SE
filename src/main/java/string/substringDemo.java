package string;

/**
 * String substring(int start,int end)
 * 截取当前字符串指定范围内的子字符串，两个参数对应的是开始和结束位置，需要注意。
 * 在java API中通常使用两个数字表示范围时，都是"含头不含尾"的。
 *
 */
public class substringDemo {
    public static void main(String[] args) {
         // 01234567890
        String host ="www.canglaoshi.org";
        //截取域名:tedu
        String sub = host.substring(4,8);
        System.out.println(sub);

        /*
            重载的substring方法传入一个参数，从该位置开始截取到字符串末尾
         */
        sub = host.substring(4);
        System.out.println(sub);
    }
}
