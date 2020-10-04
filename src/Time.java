import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        if ((x >= 3) && (x <= 8)) {
            System.out.println ("true");
        }
        else {
            System.out.println ("false");
        }
    }
}