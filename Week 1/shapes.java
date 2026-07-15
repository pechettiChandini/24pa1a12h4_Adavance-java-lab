import java.util.Scanner;

public class AreaCalculator {
    
    static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

   
    static double getTriangleArea(double base, double height) {
        return base * height * 0.5;
    }

    
    static double getSquareArea(double side) {
        return side * side;
    }

   
    static double getRectangleArea(double length, double breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            try {
                System.out.println("Enter 1 to calculate the area of a circle");
                System.out.println("Enter 2 to calculate the area of a triangle");
                System.out.println("Enter 3 to calculate the area of a square");
                System.out.println("Enter 4 to calculate the area of a rectangle");
                System.out.println("Enter 5 to terminate the program");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        System.out.println("Area = " + getCircleArea(radius));
                        break;
                    case 2:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        System.out.println("Area = " + getTriangleArea(base, height));
                        break;
                    case 3:
                        System.out.print("Enter side length: ");
                        double side = scanner.nextDouble();
                        System.out.println("Area = " + getSquareArea(side));
                        break;
                    case 4:
                        System.out.print("Enter length: ");
                        double length = scanner.nextDouble();
                        System.out.print("Enter breadth: ");
                        double breadth = scanner.nextDouble();
                        System.out.println("Area = " + getRectangleArea(length, breadth));
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            } catch (java.util.NoSuchElementException e) {
                System.out.println("No input provided. Exiting...");
                break;
            }
        }

        System.out.println("Program terminated");
        scanner.close();
    }
}