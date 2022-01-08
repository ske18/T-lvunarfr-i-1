/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Turtle {

    //tilviksbreytur
    private double x, y; // staðsetning pennans
    private double angle; // hornið sem þú teiknar undir

    //smiðir
    public Turtle(double x0, double y0, double a0) {
        // frumstilla tilviksbreytur
        x = x0;
        y = y0;
        angle = a0;
    }

    //aðferðir
    public void toLeft(double delta) {
        // breytum tilviksbreytunni angle
        angle = angle - delta;
    }

    public void goForward(double step) {
        double oldx = x;
        double oldy = y;
        x += step * Math.cos(Math.toRadians(angle));
        y += step * Math.sin(Math.toRadians(angle));
        StdDraw.line(oldx, oldy, x, y);
    }

    public static void main(String[] args) {
        Turtle t = new Turtle(0.5, 0.0, 60.0);
        t.goForward(1.0);
        t.toLeft(120);
        t.goForward(1.0);
        t.toLeft(120);
        t.goForward(1.0);
        t.toLeft(120);
    }
}
