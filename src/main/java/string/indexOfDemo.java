package string;

/**
 * int indexOf(String str)
 * 返回给定字符串在当前字符串中的位置，如果当前字符串不包含给定内容则返回值为-1
 *
 */
public class indexOfDemo {
    public static void main(String[] args) {
        //      0123456789012345
        String str ="thinKing in java";

       int index= str.indexOf("in");
       System.out.println("index:"+index);//2
        /*
            重载的方法可以从指定位置开始查找第一次出现给定字符串的位置
         */
       index = str.indexOf("in",3);
       System.out.println("index:"+index);//5

        /*
            lastIndexOf方法可以查找最后一次出现给定字符串的位置
         */
        index = str.lastIndexOf("in");
        System.out.println("index:"+index);//9
    }
}
