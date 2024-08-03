import javax.xml.namespace.QName;

  public class object
  {
     int a=1; //instance variable
     String name="Sharma";
      public static void main(String[] args)
    {
       object obj1 = new object();
       object obj2 =new object();
       obj1.name="Atul";
       System.out.println(obj1.name);
       System.out.println(obj1.a);
       System.out.println(obj2.name);
       System.out.println(obj2.a);

    }
}
