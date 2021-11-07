package string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 字符串频繁修改带来的性能损耗
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "a";
        for (int i = 0; i < 10000000; i++) {
            str = str + "a";
        }
        System.out.println("执行完毕!");
    }
}