package ru.test.sandbox;

public class FirstProgram {

    public static void main(String[] args) {

      Square s = new Square(5);
      //s.l = 5;

      Rectangle r = new Rectangle(2,3);
      r.a = 2;
      r.b = 3;
      System.out.println ("Площадь квадрата со стороной "+ s.l + " = " + area(s));
      System.out.println ("Площадь прямоугольника со сторонами "+ r.a + " и " + r.b +  " = " + area(r));
    }

    public static void hello(String smb) {
       System.out.println("Hello, " + smb + " !" );
    }

    public static double area (Square s){
      return s.l*s.l;
    }

    public static double area (Rectangle r){
      return r.a*r.b;
    }
}
