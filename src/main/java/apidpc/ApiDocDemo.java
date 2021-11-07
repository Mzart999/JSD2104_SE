package apidpc;

/**
 * 文档注释只在三个地方使用，分别是:类上，方法上和常量上
 * 文档注释是功能级注释，用来说整体功能的。而不是拘泥于某一句代码的意思
 * 文档注释会被Javadov命令生成一个文档。
 *
 * 在类上使用时通常说明当前类的整体设计功能。
 * @author 作者名:Lawrence
 */
public class ApiDocDemo {

   public static final String INFO="您好";
    /**
     * 队给定的用户添加问候语
     * @Param name 指定的用户名
     * @return 含有问候语的一个字符串
     *
     */
     public String sayHello(String name){
         return "Hello!" +name;
    }
}
