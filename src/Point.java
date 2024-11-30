public class Point {
    private String name;
    private int x;
    private int y;
    private double originDistance;
    private String formattedDistance;

    public Point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        int sumOfSquares = (int) (Math.pow(x, 2) + Math.pow(y, 2));
        this.originDistance = Math.pow(sumOfSquares, 0.5);
        this.formattedDistance = String.format("%.2f", originDistance);
    }

    public Point() {
        this.name = "default";
    }

    @Override
    public String toString() {
        return "Point{name='" + name + "', x=" + x + ", y=" + y + ", distance=" + formattedDistance + "}";
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setOriginDistance(int originDistance) {
        this.originDistance = originDistance;
    }

    public double getOriginDistance() {
        return originDistance;
    }

    public String getFormattedDistance() {
        return formattedDistance;
    }
}
