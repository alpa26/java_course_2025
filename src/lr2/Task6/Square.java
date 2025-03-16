package lr2.Task6;

public class Square implements IFigure {
    public int Size;

    public Square(int _size){
        Size = _size;
    }

    @Override
    public double CalculateArea() {
        return  this.Size * this.Size;

    }

    @Override
    public double CalculatePerimeter() {
        return  this.Size * 4;
    }
}
