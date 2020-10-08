import java.util.Scanner;

public class Tabuada_For {

    public static void main(String[] args) {
        int r, n=1;

        for (int i = 1; i<=10; i++) {
            for (int t=1;t<=10;t++) {
                n = t;
                r = n * i;
                System.out.println(n+"*"+i+"="+r);
            }
            System.out.println("\n");
        }

    }
}