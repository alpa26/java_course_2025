package lr2.Task6;

public class Circle implements IFigure {
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
