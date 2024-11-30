import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = WhichPointCloser.generatePoints(2);
        WhichPointCloser.printPoints(points);
        WhichPointCloser.printCloserPoint(WhichPointCloser.whichPointCloser(points));
    }
}
