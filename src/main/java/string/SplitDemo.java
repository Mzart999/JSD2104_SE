package string;

import java.util.Arrays;

/**
 * String支持正则表达式的方法之二：
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分出的所有部分以一个数组形式返回
 *
 */
public class SplitDemo {
    public static void main(String[] args) {
       //按照数字部分进行拆分，得到所有的字母部分
        String line = "abc123drf456ghi";
        //按照数字部分进行拆分，得到所有的字母部分
        String [] data = line.split("[0-9]+");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));

        /*
            当字符串一开始就遇到了可拆分项，则首先会拆分出一个空字符串。
            如果连续遇到两个可拆分项，则之间会拆分出一个空字符串。
            如果是在字符串末尾连续遇到了可分拆项，则所有拆分出的空字符串都忽略！
         */
        line = "abc.def.ghi.jkl";
        data = line.split("\\.");
        System.out.println(Arrays.toString(data));
   }
}
