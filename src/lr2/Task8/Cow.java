package lr2.Task8;

public class Cow extends Animal{
    public final boolean GetMilk;

    public Cow(int age, String name,String color, double weight,boolean getMilk ) {
        super(age,name, color,weight);
        GetMilk = getMilk;
    }

    @Override
    public void ToString() {
        System.out.printf("Информация о корове: Имя %s, Возраст %d, Цвет %s, Вес %.2f, Молоко дает: %s \n",
                getName(),
                getAge(),
                getColor(),
                getWeight(),
                GetMilk);
    }
    @Override
    public void makeSound() {
        System.out.println("Moo moo mooooooooo");
    }
}
