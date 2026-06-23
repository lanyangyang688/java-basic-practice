package cpt105.F24_25;

public class GetArise {
    public static void main(String[] args) {
        int a =getArise("12123123432");
        System.out.println(a);
    }

    public static int getArise(String input) {
        if (input.length() <= 1){
            return input.length();
        }
        int count = 1;
        int max;

        for (int i = 1; i < input.length(); i++) {
            if (Integer.parseInt(Character.toString(input.charAt(i))) >=
                    Integer.parseInt(Character.toString(input.charAt(i-1)))) {
                count++;
            } else {
                count = 1;
            }
        }
        max = Math.max(count, getArise(input.substring(1)));
        return Math.max(max, getArise(input.substring(0, input.length()-1)));
    }
}
