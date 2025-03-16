package lr2.Task5;

public class Rectangle {
    public int Width;
    public int Length;

    public Rectangle(int _width,int _length){
        Width = _width;
        Length = _length;
    }
    public void SetWidth(int _width){
        Width = _width;
    }

    public int GetWidth(){
        return Width;
    }
    public void SetLength(int _length){
        Length = _length;
    }

    public int GetLength(){
        return Length;
    }

    public double CalculateArea() {
        return this.Width * this.Length;
    }

    public double CalculatePerimeter() {
        return 2 * this.Width +  2 * this.Length;
    }
}
