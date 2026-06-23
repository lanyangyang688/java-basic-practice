package lab6;

public class Exercise01 {

public static int sol(String s) {
    // 如果字符串为空，返回0
    if (s == null || s.isEmpty()) {
        return 0;
    }
    char firstChar = s.charAt(0);
    int count = 0;
    // 遍历字符串统计第一个字符的出现次数
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == firstChar) {
            count++;
        }
    }
    return count;
    }

}