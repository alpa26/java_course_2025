package lr2.Task8;

public class Cat extends Animal{
    public final double WoolLength;

    public Cat(int age, String name,String color, double weight, double woolLength) {
        super(age,name, color,weight);
        WoolLength =woolLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow meow");
    }


    @Override
    public void ToString() {
        System.out.printf("Информация о коте: Имя %s, Возраст %d, Цвет %s, Вес %.2f, Длина шерсти: %s \n",
                getName(),
                getAge(),
                getColor(),
                getWeight(),
                WoolLength);
    }
}
