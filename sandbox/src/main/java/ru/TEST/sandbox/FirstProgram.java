package ru.test.sandbox;

public class FirstProgram {

    public static void main(String[] args) {
       hello("world");
       double l = 5;
       double a = 2;
       double b = 3;
       System.out.println ("Площадь квадрата со стороной "+ l + " = " + area(l));
       System.out.println ("Площадь прямоугольника со сторонами "+ a + " и " + b +  " = " + area(a, b));
    }

    public static void hello(String smb) {
       System.out.println("Hello, " + smb + " !" );
    }

    public static double area (double l){
      return l*l;
    }

    public static double area (double a, double b){
      return a*b;
    }
}
