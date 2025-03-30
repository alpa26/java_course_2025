package lr2.Task8;


public class Main {
    public static void main(String[] args) {
        Bird b = new Bird(2,"Галя","Синяя",1,true);
        b.ToString(); // Вызываем метод, который использует методы родительского класса
        b.makeSound();
        Cow cow = new Cow(8,"Бурена", "Белая",100,true);
        cow.ToString(); // Вызываем метод, который использует методы родительского класса
        cow.makeSound();
        Fish f = new Fish(1, "Вася", "Золотая", 0.1, 10);
        f.ToString(); // Вызываем метод, который использует методы родительского класса
        f.makeSound();
        Cat cat = new Cat(5,"Граф", "Черный" ,5, 0.5);
        cat.ToString(); // Вызываем метод, который использует методы родительского класса
        cat.makeSound();
    }
}
