import java.util.Scanner;

public class hw1 {
    public hw1() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();

        String b;
        for(b = ""; n > 0; n /= 2) {
            b = b + n % 2;
        }

        StringBuilder sb = new StringBuilder(b);
        sb.reverse();
        System.out.println(sb);
        in.close();
    }
}