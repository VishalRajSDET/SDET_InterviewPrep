//package OopsConcept.AbstractClass;
///**
// * No, it's not mandatory to override every method when you extend an abstract class in Java.
// * Abstract Methods: ==> You must override all abstract methods from the abstract class. If you don't,
// * your concrete subclass will also be considered abstract, and you won't be able to instantiate it.
// * Abstract methods are declared without an implementation in the abstract class, forcing subclasses to provide their own.
// * =======================================================================================================================
// * Concrete Methods:==> You can choose to override concrete (non-abstract) methods inherited from the abstract class.
// * If you don't override them, your subclass will simply inherit and use the implementation provided in the abstract class.
// * This is often done when the default implementation is sufficient or when you want to use the parent's logic.
// */
//abstract class Shape {
//    String color;
//
//    public Shape(String color) {
//        this.color = color;
//    }
//
//    // Abstract method: No implementation, must be implemented by subclasses
//    public abstract double calculateArea();
//
//    public void displayColor() {
//        System.out.println("This shape is " + color);
//    }
//
//    class Circle extends Shape {
//        double radius;
//
//        public Circle(String color, double radius) {
//            super(color);
//            this.radius = radius;
//        }
//
//        @Override
//        public double calculateArea() { // Implementation for Circle
//            return Math.PI * radius * radius;
//        }
//    }
//    public class Test {
//        public static void main(String[] args) {
//            Circle circle=new Circle();
//        }
//    }
//}
//
//
