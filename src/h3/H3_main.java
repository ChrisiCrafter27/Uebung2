package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;

        boolean b1 = i > j;
        boolean b2 = i > 200;
        boolean b3 = j > 100;

        k = -10;

        if(b1) {
            if(!b3) {
                if(!b2) k = 1;
                else k = 2;
            } else if(b2) k = 3;
        } else if(!b2 && !b3) k = 4;
    }
}
