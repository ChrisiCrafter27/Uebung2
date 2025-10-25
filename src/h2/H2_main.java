package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int min = 0;
        int max = 0;

        if(i > j) {
            max = i;
            min = j;
        } else {
            max = j;
            min = i;
        }

        if(k < min) min = k;
        if(k > max) max = k;
    }
}
