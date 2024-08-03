import java.util.Scanner;

public class switchcase2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num= sc.nextInt();

        switch (num){
            case 200: System.out.println("case 1");
            break;
            case 10000: System.out.println("case 2");
            break;
            case 20: System.out.println("case 3");
            break;
        }
    }
}
