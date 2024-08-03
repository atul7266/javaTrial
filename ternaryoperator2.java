import java.util.Scanner;

public class ternaryoperator2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int age=30;
        String res= (age>=18 && age<=60)? (age >20 && age <30)? "You are in 20's" : (age>=30 && age<=40)? "you are in 30's": "you are still teen": (age>60)? "you are an old man":(age>=16 && age<18)? " You are teen ager": "You are still a man";
        System.out.println(res);


    }
}
