// Тема-робота з класами
//описує людину, її дані та базові дії — рух і розмову
public class Person {
    // Поля для зберігання імені та віку
    String fullName;
    int age;

    // Кон
    public Person() {
    }

    // Кон для ініціалізації іме та віку
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод, що імітує рух
    void move() {
        System.out.println(fullName + " рухається.");
    }

    // Метод, що імітує розмову
    void talk() {
        System.out.println(fullName + " говорить.");
    }

    public static void main(String[] args) {
        // Створення двох об'єктів різними способами
        Person p1 = new Person();
        Person p2 = new Person("Олексій Петров", 25);

        p2.move();
        p2.talk();
    }
}