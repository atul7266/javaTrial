import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int X =sc.nextInt();

        if(X%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
