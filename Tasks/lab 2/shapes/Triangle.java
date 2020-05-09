package ru.spbstu.main.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon
{
    float x1, x2, x3, y1, y2, y3;
    int rotationAngle;

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3, int rotationAngle)
    {

        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.rotationAngle = rotationAngle;
        if(getArea() <= 0)
        {
            throw new IllegalArgumentException("Wrong initialization of triangle!");
        }
    }

    public float distance(float x1, float x2, float y1, float y2)
    {
        return (float) Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
    }

    @Override
    public float getPerimeter()
    {
        return (distance(this.x1, this.x2,  this.y1,  this.y2)
                + distance(this.x2, this.x3,  this.y2,  this.y3)
                + distance(this.x3, this.x1, this.y3, this.y1));
    }

    @Override
    public float getArea()
    {
        return (float) (0.5 * Math.abs((this.x1 - this.x3) * (this.y2 - this.y3)
                - (this.x2 - this.x3) * (this.y1 - this.y3)));
    }

    @Override
    public int getRotation()
    {
        return this.rotationAngle;
    }

    @Override
    public float getX()
    {
        return ((this.x1 + this.x2 + this.x3)/3);
    }

    @Override
    public float getY()
    {
        return ((this.y1 + this.y2 + this.y3)/3);
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
