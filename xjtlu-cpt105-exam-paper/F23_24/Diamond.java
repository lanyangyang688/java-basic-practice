package cpt105.F23_24;

public class Diamond {
    public static void main(String[] args) {
        diamond(5);
    }

    public static void diamond(int n){
        int m = n/2;
        for (int i = -m; i <= m ; i++) {
            for (int j = -m; j <= m ; j++) {
                if (Math.abs(i) + Math.abs(j) <= m){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
