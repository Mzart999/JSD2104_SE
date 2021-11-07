package string;
/**
 * char charAt(int index)
 * 返回当前字符串中指定位置的字符
 */
public class charAtDemo {
    public static void main(String[] args) {
        //      01234567890123450
        String str =" thinking in Java";
        //查看第10个字符是什么?
        char c = str.charAt(10);
        System.out.println(c);

        //验证回文  2   6
        String line ="山泉水来自山上";
        //i的取值范围：0 1 2 3
        for (int i=0;i<line.length()/2;i++){
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length()-1-i);
            if (c1!=c2){

            }
        }
    }
}
