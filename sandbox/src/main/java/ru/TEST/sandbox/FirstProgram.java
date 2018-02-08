package ru.test.sandbox;

public class FirstProgram {

  public static void main(String[] args) {

    Square s = new Square(5);
    Rectangle r = new Rectangle(2, 3);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String smb) {
    System.out.println("Hello, " + smb + " !");
  }
}
