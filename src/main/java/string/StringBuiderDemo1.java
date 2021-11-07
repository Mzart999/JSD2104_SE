package string;

/**
 * StringBuilder是专门用来修改字符串内容的API，其内部维护一个可变的char数组
 * 修改速度块，内存开销小。并且提供了便于修改字符串内容的相关操作：增，删，改，插等。
 */
public class StringBuiderDemo1 {
    public static void main(String[] args) {
      String str = "好好学习java";
        //内部表示一个空字符串:""
 //     StringBuilder builder = new StringBuilder();

      //基于现有的字符串创建(会将给定字符串复制一份内容到SttringBuilder内部
       // StringBuilder builder = new StringBuilder(str);
        /*
            StringBuilder是JDK5之后退出的新的API
            StringBuffer是JDK1.0与String一起推出的类
            功能一致，区别是StringBuilder不考虑并发安全问题
         */
            StringBuffer builder = new StringBuffer(str);
        /*
            StringBuilder也提供了String自身的大部分方法，比如length，
            indexOf等等
         */
        int len = builder.length();
        System.out.println("len"+len);
        System.out.println(builder);
        /*
          好好学医Java
          好好学习java,为了找个好工作！

          append():追加内容
         */
        builder.append("好好学习java,为了找到好工作!");
        System.out.println(builder);

        /*
           好好学习java,为了找个找工作！
           好好学习Java,就是为了改变世界！
           replace():将当前字符串中的部分内容替换为给定内容
        */
        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder);

        /*
          好好学习java,就是为了改变世界！
          ，就是为了改变世界！
          delete():删除当前字符串中的部分内容
         */
        builder.delete(0,8);
        System.out.println(builder);

      /*
        ,就是为了改变世界！
        活着，就是为了改变世界！
        insert():将给定内容插入到指定位置
       */
        builder.insert(0,"活着");
        System.out.println(builder);

        /*
            反转字符串
         */
        builder.reverse();
        System.out.println(builder);

        //str内容没有变化
        System.out.println(str);
        /*
          StringBuilder的toString方法可以将内部表示的字符串内容以一个
          String实例形式返回
         */
        str = builder.toString();
        System.out.println(str);
    }
}
