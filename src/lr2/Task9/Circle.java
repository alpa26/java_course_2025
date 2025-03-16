package lr2.Task9;


public class Circle extends Shape {
    public int Radius;
    public Circle(int _radius){
        Radius = _radius;
    }

    @Override
    public double CalculateArea() {
        return this.Radius * this.Radius * 3.14;
    }

    @Override
    public double CalculatePerimeter() {
        return 2 * this.Radius *  3.14;
    }
}
