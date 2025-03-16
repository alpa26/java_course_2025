package lr2.Task9;


public class Triangle extends Shape {
    public int Foundation;
    public int Size1;
    public int Size2;

    public int Height;

    public Triangle(int _foundation, int _height
            , int _size1
            , int _size2){
        Foundation = _foundation;
        Height = _height;
        Size1 = _size1;
        Size2 = _size2;
    }

    @Override
    public double CalculateArea() {
        return 0.5 * this.Height * this.Foundation;
    }

    @Override
    public double CalculatePerimeter() {
        return this.Size1 + this.Foundation + this.Size1;
    }
}
