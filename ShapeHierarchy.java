//Реалізація ієрархії геометричних тіл для обчислення їх об'єму через спадкування

    class Shape {
        double volume;
        double getVolume() { return volume; }
    }

    // Клас для тіл обертання
    class SolidOfRevolution extends Shape {
        double radius;
        double getRadius() { return radius; } //
    }

    // Куля
    class Ball extends SolidOfRevolution {
        public Ball(double radius) {
            this.radius = radius;
            this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
    }

    // Циліндр
    class Cylinder extends SolidOfRevolution {
        double height;
        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
            this.volume = Math.PI * Math.pow(radius, 2) * height;
        }
    }

    // Піраміда
    class Pyramid extends Shape {
        double s; // площа основи
        double h; // висота
        public Pyramid(double s, double h) {
            this.s = s;
            this.h = h;
            this.volume = (1.0 / 3.0) * s * h;
        }
    }

    public class ShapeHierarchy {
        public static void main(String[] args) {
            Ball b = new Ball(10);
            Pyramid p = new Pyramid(50, 15);
            System.out.println("Об'єм кулі: " + b.getVolume());
            System.out.println("Об'єм піраміди: " + p.getVolume());
        }
    }
