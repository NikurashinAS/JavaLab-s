package ru.spbstu.main.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon
{
    float x, y, width, height;
    int rotationAngle;
    public Rectangle (float x, float y, float width, float height, int rotationAngle)
    {
        if(width <= 0 || height <= 0)
        {
            throw new IllegalArgumentException("Wrong initialization of rectangle!");
        }

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rotationAngle = rotationAngle;
    }

    @Override
    public float getPerimeter()
    {
        return (this.width + this.height) * 2;
    }

    @Override
    public float getArea()
    {
        return (this.width * this.height);
    }

    @Override
    public int getRotation()
    {
        return (int) this.rotationAngle;
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
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}

