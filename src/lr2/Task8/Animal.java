package lr2.Task8;

public abstract class Animal {
    protected int Age;
    protected String Name;
    protected String Color;
    protected double Weight;

    public Animal(int age, String name, String color, double weight) {
        Age = age;
        Name = name;
        Color = color;
        Weight = weight;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public String getColor() {
        return Color;
    }

    public double getWeight() {
        return Weight;
    }

    public abstract void ToString();

    public abstract void makeSound();
}
