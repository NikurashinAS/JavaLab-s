package ru.spbstu.main;

import ru.spbstu.main.shapes.Circle;
import ru.spbstu.main.shapes.Shape;
import ru.spbstu.main.shapes.Rectangle;
import ru.spbstu.main.shapes.Triangle;

import java.awt.*;
import java.security.InvalidParameterException;

public class Main {
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(1, 2, 6);
        Circle circle2 = new Circle(3, 4, 7);
        Circle circle3 = new Circle(5, 6, 8);
        Circle circle4 = new Circle(7, 8, 9);
        Triangle triangle1 = new Triangle(2, 4, 6, 6, 4, 2, 5);
        Triangle triangle2 = new Triangle(-1, -1, 2, 3, 1, 1, 10);
        Triangle triangle3 = new Triangle(1, 7, 2, 8, 9, 3, 51);
        Rectangle rectangle1 = new Rectangle(1, 4, 8, 8, 12);
        Rectangle rectangle2 = new Rectangle(8, 2, 1, 3, 3);
        Rectangle rectangle3 = new Rectangle(7, 15, 17, 3, 3);
        Shape[] shapes = {rectangle1, circle1, triangle1, rectangle2, circle2, triangle2, rectangle3, circle3, triangle3, circle4};

        Shape maxArea = findBigArea(shapes);
        System.out.println("Big shape area: " + maxArea.getArea());

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

    public static Shape findBigArea(Shape[] shapes) {

        if (shapes== null)
        {
            throw new IllegalArgumentException("Invalid array of shapes!");
        }

        Shape maxArea= shapes[0];

        for (int i = 1; i < shapes.length; i++)
        {
            if (shapes[i].getArea() > maxArea.getArea())
            {
                maxArea = shapes[i];
            }
        }
        return maxArea;
    }
}