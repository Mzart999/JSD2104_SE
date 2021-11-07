package string;

/**
 * 和谐用语
 */
public class ReplaceAllDemo2 {
    public static void main(String[] args) {
        String regex = "(wqnmlgb|wrsndm|dsb|cnm|nc|cnm|djb|nmb)";
        String message ="wqnmlgb!你个dsb，怎么这么nc。nmb，我觉得你就是个djb!";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
    }
}
