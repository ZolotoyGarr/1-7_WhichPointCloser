import java.util.ArrayList;
import java.util.Scanner;

public class WhichPointCloser {

    public static Point whichPointCloser(ArrayList<Point> points) {
        Point closerPoint = points.get(0);
        for (Point current : points) {
            if (current.getOriginDistance() < closerPoint.getOriginDistance()) {
                closerPoint = current;
            }
        }
        return closerPoint;
    }

    public static ArrayList<Point> generatePoints(int numberOfPoints) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 1; i < numberOfPoints + 1; i++) {
            System.out.println("Enter the point " + i + " name: ");
            String currentName = scanner.nextLine();
            System.out.println("Enter the x coordinate of the " + i + " point: ");
            int currentX = scanner.nextInt();
            System.out.println("Enter the y coordinate of the " + i + " point: ");
            int currentY = scanner.nextInt();
            scanner.nextLine(); // После считывания каждой координаты (x и y), вызывается scanner.nextLine(), чтобы удалить символ новой строки,
            // Оставшийся после ввода числа. Это позволяет корректно считывать следующую строку имени точки.
            points.add(new Point(currentName, currentX, currentY));
        }
        return points;
    }

    public static void printPoints(ArrayList<Point> points) {
        for (Point point : points) {
            System.out.println(point);
        }
    }

    public static void printCloserPoint(Point point) {
        System.out.println("The point closest to the origin: " + point.getName() + ": " + point.getFormattedDistance());
    }
}