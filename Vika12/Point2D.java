import java.util.Arrays;
import java.util.Comparator;

/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Point2D implements Comparable<Point2D> {
    private double x;
    private double y;

    public Point2D(double x0, double y0) {
        x = x0;
        y = y0;
    }

    public DistanceOrder distanceToOrder() {
        return new DistanceOrder();
    }

    private class DistanceOrder implements Comparator<Point2D> {
        @Override
        public int compare(Point2D o1, Point2D o2) {
            double dist1 = distanceSquaredTo(o1);
            double dist2 = distanceSquaredTo(o2);
            return Double.compare(dist1, dist2);
        }
    }

    public double distanceSquaredTo(Point2D p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return dx * dx + dy * dy;
    }

    @Override
    public int compareTo(Point2D o) {
        if (this.y < o.y) return -1;
        if (this.y > o.y) return 1;
        return Double.compare(this.x, o.x);
        /*         if (this.x < o.x) return -1;
        if (this.x > o.x) return 1;
        return 0;
         */
    }

    public static void main(String[] args) {
        Point2D p0 = new Point2D(0.0, 0.0);
        Point2D p1 = new Point2D(0.5, 0.4);
        Point2D p2 = new Point2D(0.6, 0.4);
        Point2D[] points = {p1, p2};
        System.out.println(p1.compareTo(p2));
        Arrays.sort(points); // Venjulega compare to
        Arrays.sort(points, p0.distanceToOrder()); // raða point punktum í röð eftir distance
    }
}
