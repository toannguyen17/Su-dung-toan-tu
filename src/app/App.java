package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        Rectangle rectangle = new Rectangle(width, height);

        float area = rectangle.getArea();

        System.out.println("Area is: " + area);
    }
}