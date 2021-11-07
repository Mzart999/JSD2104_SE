package string;

/**
 * String支持正则表达的方法之一:
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串的格式，匹配则返回true
 */
public class MatchesDemo {
    public static void main(String[] args) {
    /*
        邮箱的正则表达式:
        用户名@域名.后缀
        用户名:数字，字母，下划线。出现一次以上。
        域名:数字，字母。出现一次以上。
        后缀:.字母组合。出现一次以上
        [A-ZA-Z0-9]+@[A-ZA-Z0-9]+(\.[a-zA-Z0-9]+
        */
        String mail ="liminhao@tedu.cn";
        String regex="[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";

        boolean match = mail.matches(regex);
        if (match){
            System.out.println("是邮箱");
        }else {
            System.out.println("不是邮箱");
        }
    }
}
