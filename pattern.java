import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=4;
        int m=5;

        for (int i=1; i<=n;i++){
           for (int a=1; a<=m;a++){
               System.out.print("*");
           }
            System.out.println("*");
        }
    }
}
