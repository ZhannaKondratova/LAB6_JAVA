//моделює роботу телефона: зберігання номера, обробку дзвінків та надсилання повідомлень.
public class Phone {
    String number;
    String model;
    double weight;

    // Конструктори з різною кількістю параметрів
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    // Виводить ім'я того, хто дзвонить
    void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    // Перевантажений метод: приймає ім'я та номер
    void receiveCall(String name, String number) {
        System.out.println("Дзвонить " + name + " з номера " + number);
    }

    // Повертає номер поточного телефону
    String getNumber() {
        return number;
    }

    // Метод з аргументами змінної довжини для списку номерів
    void sendMessage(String... numbers) {
        System.out.println("Надсилаємо повідомлення на номери:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // Створ 3ох екземплярів
        Phone ph1 = new Phone("095-111-22-33", "iPhone 15", 0.18);
        Phone ph2 = new Phone("067-444-55-66", "Samsung S23");
        Phone ph3 = new Phone();

        // Виклик методів для перевірки
        ph1.receiveCall("Марія");
        System.out.println("Мій номер: " + ph1.getNumber());
        ph2.receiveCall("Андрій", "050-000-00-00");
        ph1.sendMessage("095-111", "067-444");
    }
}
