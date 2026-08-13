import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int option;
        boolean loop = true;
        GeometricForm geometricform = null;
        while (loop == true) {
            System.out.println("Select the geometric shape to calculate the area: \n1-Square\n2-Rectangle\n3-Circle\n4-EXIT");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> geometricform = createSquare();
                
                case 2 -> geometricform = createRectangle();
                 
                case 3 -> geometricform = createCircle();
                 
                case 4 -> {
                    loop = false;
                    continue;
                }

                default -> {
                    System.out.println("Type an acceptable value");
                    continue;
                }
            }
            System.out.println("The area of your geometric shape is: " + geometricform.getArea());
            System.out.println("==========================================");
        }
    }
    private static GeometricForm createSquare(){
        System.out.println("Type the size of the sides:");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createCircle(){
        System.out.println("Type the size of the radius:");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Type the height:");
        double height = scanner.nextDouble();
        System.out.println("Type the base:");
        double base = scanner.nextDouble();
        return new Rectangle(height, base);
    }
}
