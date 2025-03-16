package lr2.Task8;

public class Bird extends Animal{
    public final boolean CanFly;

    public Bird(int age, String name,String color, double weight, boolean canFly ) {
        super(age,name, color,weight);
        CanFly= canFly;
    }

    @Override
    public void ToString() {
        System.out.printf("Информация о птице: Имя %s, Возраст %d, Цвет %s, Вес %.2f, Умеет летать: %s  \n",
                getName(),
                getAge(),
                getColor(),
                getWeight(),
                CanFly);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirik chirik chirik");
    }
}
