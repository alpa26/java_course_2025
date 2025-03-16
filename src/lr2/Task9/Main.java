package lr2.Task9;


import lr2.Task6.Circle;
import lr2.Task6.Square;
import lr2.Task6.Triangle;


public class Main {
    public static void main(String[] args) {
        lr2.Task6.Circle circle = new Circle(10);
        System.out.printf("Площадь круга: %.2f \n",circle.CalculateArea());
        System.out.printf("Периметр круга: %.2f \n",circle.CalculatePerimeter());

        lr2.Task6.Square sqr = new Square(10);
        System.out.printf("Площадь квадрата: %.2f \n",sqr.CalculateArea());
        System.out.printf("Периметр квадрата: %.2f \n",sqr.CalculatePerimeter());

        lr2.Task6.Triangle trianglet = new Triangle(10,4,6,7);
        System.out.printf("Площадь треугольника: %.2f \n",trianglet.CalculateArea());
        System.out.printf("Периметр треугольника: %.2f \n",trianglet.CalculatePerimeter());
    }
}
