import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=50;
        int b=20;

        int result= (a<20)? a: b;
        System.out.println(result);
    }
}
