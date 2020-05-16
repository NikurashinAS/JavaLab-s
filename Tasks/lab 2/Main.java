package ru.spbstu.main;
import ru.spbstu.main.shapes.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(1, 2, 6);
        Circle circle2 = new Circle(3, 4, 7);
        Circle circle3 = new Circle(7, 8, 9);
        Circle circle4 = new Circle(7, 8, 9);
        Triangle triangle5 = new Triangle(2, 4, 6, 6, 4, 2, 5);
        Triangle triangle6 = new Triangle(-1, -1, 2, 3, 1, 1, 10);
        Triangle triangle7 = new Triangle(1, 7, 2, 8, 9, 3, 51);
        Rectangle rectangle8 = new Rectangle(1, 4, 9, 8, 12);
        Rectangle rectangle9 = new Rectangle(8, 2, 1, 3, 3);
        Rectangle rectangle10 = new Rectangle(7, 15, 17, 3, 3);
        Shape[] shapes = {circle1, circle2, circle3, circle4, triangle5, triangle6, triangle7, rectangle8, rectangle9,rectangle10};

        Shape maxArea = findBigArea(shapes);
        System.out.println("Big shape area : " + maxArea.getArea());

}
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */

   private static Shape findBigArea(Shape[] shapes)
   {
       if (shapes== null)
       {
           throw new IllegalArgumentException("Invalid array of shapes!");
       }
      Shape biggestShape = shapes[0];
      int BigArea [] = new int[10];
      for (Shape shape : shapes)
       {
           if (shape.getArea() > biggestShape.getArea())
           {
               biggestShape = shape;
           }
       }

       int y = 1;
       for (int i = 0; i< shapes.length; i++)
       {
           if (shapes[i].getArea() == biggestShape.getArea())
           {
               System.out.println("Big shape area: " + shapes[i].getClass() + (i+1));
           }
       }
       return biggestShape;
   }
}
