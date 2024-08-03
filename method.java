
class calc{
    public int add(int a, int b)
    {
        int result= a+b;
        return result;
    }
    public int add(int a, int b, int c)
    {
        int result2=a+b+c;
        return result2;
    }
    public double add(double a, double b)
    {
        double result3=a+b;
        return result3;
    }
}

public class method {
    public static void main(String[] args)
    {
        calc obj=new calc();

        int result= obj.add(10,20);
        System.out.println(result);

        int result2=obj.add(15,25,35);
        System.out.println(result2);

        double result3=obj.add(2.5,3.5);
        System.out.println(result3);

    }
}
