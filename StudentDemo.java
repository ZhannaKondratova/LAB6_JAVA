//Завдання 5 створює опис успішності студента ,
//а завдання 6 розширює цей клас новими можливостями.

class StudentProgress {
    String lastName;
    String firstName;
    int math, physics, java;

    // Введення та виведення даних
    void setData(String lName, String fName, int m, int p, int j) {
        this.lastName = lName;
        this.firstName = fName;
        this.math = m;
        this.physics = p;
        this.java = j;
    }

    void printInfo() {
        System.out.println("Студент: " + lastName + " " + firstName);
        System.out.println("Оцінки: " + math + ", " + physics + ", " + java);
    }

    // Розрахунок середнього бала
    double average() {
        return (math + physics + java) / 3.0;
    }
}

// Клас-спадкоємець із завдання 6
class MasterStudent extends StudentProgress {
    // Два нових поля
    String researchTopic;
    String mentor;

    public MasterStudent(String lName, String fName, int m, int p, int j, String topic, String mentor) {
        setData(lName, fName, m, p, j);
        this.researchTopic = topic;
        this.mentor = mentor;
    }

    // Перевизначення методу виведення
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Наукова робота: " + researchTopic);
        System.out.println("Керівник: " + mentor);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        MasterStudent m = new MasterStudent("Коваль", "Анна", 5, 5, 5, "Нейронні мережі", "Професор Бударецький");
        m.printInfo();
        System.out.println("Середній бал: " + m.average());
    }
}