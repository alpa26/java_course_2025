package lr2.Task8;

public class Fish extends Animal{
    public double SwimSpeed;

    public Fish(int age, String name,String color, double weight, double swimSpeed) {
        super(age,name, color,weight);
        SwimSpeed = swimSpeed;
    }

    @Override
    public void ToString() {
        System.out.printf("Информация о рыбе: Имя %s, Возраст %d, Цвет %s, Вес %.2f, Скорость в воде:  %.2f \n",
                getName(),
                getAge(),
                getColor(),
                getWeight(),
                SwimSpeed);
    }
    @Override
    public void makeSound() {
        System.out.println("Bool, Bool ...");
    }
}
