//Демонстрація абстракції: загальні правила для авто та їх конкретна реалізація в підкласах.

abstract class Car {
    // Спільні поля для всіх авто
    String model;
    String color;
    int maxSpeed;

    // Звичайний метод, спільний для всіх
    void gas() {
        System.out.println("Газуємо!");
    }

    // Абстрактний метод (кожен підклас реалізує сам)
    abstract void brake();
}

// Похідний клас Седан [cite: 134]
class Sedan extends Car {
    public Sedan(String model) { this.model = model; }
    @Override
    void brake() {
        System.out.println("Седан " + model + " зупиняється м'яко.");
    }
}

// Похідний клас Вантажівка
class Truck extends Car {
    public Truck(String model) { this.model = model; }
    @Override
    void brake() {
        System.out.println("Вантажівка " + model + " використовує пневматичні гальма.");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Створення об'єктів та виклик їх методів [cite: 134]
        Sedan mySedan = new Sedan("BMW");
        Car myTruck = new Truck("Volvo");

        mySedan.gas();
        mySedan.brake();
        myTruck.brake();
    }
}
