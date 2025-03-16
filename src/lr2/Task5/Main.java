package lr2.Task5;



public class Main {
    public static void main(String[] args) {
        Rectangle restr = new Rectangle(10,20);

        System.out.printf("Ширина: %d \n",restr.Width);
        System.out.printf("Длина: %d \n",restr.Length);
        System.out.printf("Площадь: %.2f \n",restr.CalculateArea());
        System.out.printf("Периметр: %.2f \n",restr.CalculatePerimeter());
    }
}
