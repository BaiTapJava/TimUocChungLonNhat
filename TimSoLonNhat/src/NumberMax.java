import java.util.Scanner;

public class NumberMax {
    public static void main(String[] args) {
        System.out.println("---- Tim so lon nhat ----");

        System.out.println("--- Bat dau -----");

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao so a: ");
        int a = input.nextInt();

        System.out.println("Nhap vao so b: ");
        int b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a ==0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
            }
            System.out.println("Greatest common factor: " + a);
        }
}
