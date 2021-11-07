package string;

public class Test {
    public static void main(String[] args) {
        String name1 = getName("www.tedu.cn");
        String name2 = getName("http://www.tarena.com.cn");
        String name3 = getName("doc.canglaoshi.org");
        System.out.println(name1);//tedu
        System.out.println(name2);//tarena
        System.out.println(name3);//canglaoshi
    }
   public static String getName(String line){
     //开始位置:第一个"."之后第一个字符的位置。
     int start = line.indexOf(".")+1;
     //结束位置:第二个"."的位置
       int end =line.indexOf(".",start);
       return line.substring(start,end);

    }
}
