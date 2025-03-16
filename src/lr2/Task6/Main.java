package lr2.Task6;




public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.printf("Площадь круга: %.2f \n",circle.CalculateArea());
        System.out.printf("Периметр круга: %.2f \n",circle.CalculatePerimeter());

        Square sqr = new Square(10);
        System.out.printf("Площадь квадрата: %.2f \n",sqr.CalculateArea());
        System.out.printf("Периметр квадрата: %.2f \n",sqr.CalculatePerimeter());

        Triangle trianglet = new Triangle(10,4,6,7);
        System.out.printf("Площадь треугольника: %.2f \n",trianglet.CalculateArea());
        System.out.printf("Периметр треугольника: %.2f \n",trianglet.CalculatePerimeter());
    }
}
