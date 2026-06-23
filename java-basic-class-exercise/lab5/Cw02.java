package lab5;

public class Cw02 {
    public static int countFirstChar(String input) {
        // 检查输入字符串是否为空，为空则返回 0
        if (input.isEmpty()) {
            return 0;
        }
        // 获取字符串的第一个字符
        char firstChar = input.charAt(0);
        // 用于计数第一个字符出现的次数
        int count = 0;
        // 遍历字符串的每个字符
        for (int i = 0; i < input.length(); i++) {
            // 如果当前字符与第一个字符相同，计数加 1
            if (input.charAt(i) == firstChar) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // 测试用例
        System.out.println(countFirstChar("conversation"));
        System.out.println(countFirstChar("ananas"));
        System.out.println(countFirstChar("civic"));
    }
}

