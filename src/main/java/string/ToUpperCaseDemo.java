package string;

/**
 * String toUpperCase()
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全大写或全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String line = "我爱Java";

        String upper = line.toUpperCase();
        System.out.println(upper);

        String lower = line.toLowerCase();
        System.out.println(lower);

        //匹配验证码
        String code = "3A2b4F";
        String input = "3a2b4f";
//
//        code  = code.toUpperCase();
//        input = input.toUpperCase();
//
//        if (code.equals(input)){
        //String提供了一个可以忽略大小写匹配字符串内容的方法:
        if (code.equalsIgnoreCase(input)){

            System.out.println("匹配成功!");
        }else {
            System.out.println("匹配失败!");
        }
    }
}
