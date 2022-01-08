/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing : f(x) = c - x^2
 *
 *
 *
 ****************************************************/

public class Sqrt implements DifferentiableFunction {
    private double c;

    public Sqrt(double c) {
        this.c = c;
    }

    // f(x) = c - x^2
    public double evaluate(double x) {
        return c - x * x;
    }

    // return f'(x) = -2x
    public double differentiate(double x) {
        return -2 * x;
    }
}
