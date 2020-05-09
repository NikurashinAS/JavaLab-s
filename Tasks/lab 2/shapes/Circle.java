package ru.spbstu.main.shapes;

import java.awt.Shape;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse
{
    float x, y, radius;

    public Circle (float x, float y, float radius )
    {
        if(radius <= 0)
        {
            throw new IllegalArgumentException("Wrong initialization of circle!");
        }
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public float getLength()
    {
        return (float) (2 * Math.PI * this.radius);
    }

    @Override
    public float getArea()
    {
       return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public float getX()
    {
        return this.x;
    }

    @Override
    public float getY()
    {
        return this.y;
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
