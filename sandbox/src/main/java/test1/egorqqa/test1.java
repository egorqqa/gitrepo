package test1.egorqqa;

public class test1 {

  public static void main(String[] args) {
    hello("world");
      hello("user");
      hello("Admin");

      Square s = new Square(5);
      s.l = 5;
      Rectable r = new Rectable(4, 6);
      r.a = 4;
      r.b = 6;
      System.out.println((" +area(a, b)"));
      double l = 5;
      System.out.println("Площадь квадрата со стороной " + s.l +" = " + s.area());
      System.out.println("Площадь прямоугольника со стороной = " + r.area());

  }
  public static void hello(String somebody) {


      System.out.println("Hi2all!" + somebody);
  }





}




