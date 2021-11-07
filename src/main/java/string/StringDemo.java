package string;

/**
 * 字符串是不变对象，一旦修改内容就会创建行对象
 *
 * JVM队字符串的一个优化措施：字符串常量池
 * 字符串常量池是JVM在堆内存(JDK8之后，之前是在方法区)中开辟的一块空间，用来缓存
 * 所有使用直面量形式创建的字符串对象，并进行重用。这样可以减少不必要的内存开销。
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        String s2 ="123abc";//重用s1对象
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1==s2);//true,地址相同说明指向同一个字符串对象


        String s3 ="123abc";
        System.out.println("s3:"+s3);
        System.out.println(s1==s3);//true

        s1 = s1 +"!";//修改内容会创建对象
        System.out.println("s1:"+s1);//123abc!,s1指向了一个新的对象
        System.out.println("s2:"+s2);//123abc
        System.out.println(s1==s2);//false,地址已经不相同了。

        /*
        常见面试题，下面语句创建了几个字符串对象?
        如果没有上面的内容，只有下面这句代码，那么创建了两个字符串对象
        第一个:"123abc"这个字面量创建的字符串对象
        第二个:new String()创建的字符串对象
         */

        String s4 = new String("123abc");
        System.out.println("s4:"+s4);
        System.out.println(s2==s4);//false

        /*
            String提供了比较字符产内容的操作equels方法。而实际开发中我们的实际
            需求页是比较字符串内容，因此几乎不会使用==比较字符串！
         */
        System.out.println(s2.equals(s4));//true

        String s5 = "123" + "abc";
        System.out.println("s5:"+s5);
        System.out.println(s2==s5);

        String s = "123";
        String s6 =s + "abc";
        System.out.println("s6:" +s6);
        System.out.println(s2==s6);

        String s7 = 1+2+"3"+"abc";
        System.out.println("s7:"+s7);
        System.out.println(s2==s7);//false

        String s8 ='1'+2+"3"+"abc";
        System.out.println("s8:"+s8);
        System.out.println(s2==s8);//false

        String s9 ="1"+2+"3"+"abc";
        System.out.println("s9:"+s9);
        System.out.println(s2==s9);//true
    }
}
