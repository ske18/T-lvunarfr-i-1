/*******************************************************
 * Nafn:     Svana Kristín Elísdóttir
 * T-póstur: ske12@hi.is
 *
 * Lýsing :
 *
 *
 *
 ****************************************************/

public class Counter {
    private final String name;     // counter name
    private final int maxCount;    // maximum value
    private int count;             // current value

    // create a new counter with the given parameters
    public Counter(String nafn, int efriMork) {
        name = nafn;
        maxCount = efriMork;
        count = 0;
    }

    // increment the counter by 1
    public void increment() {
        if (count < maxCount) count++;
    }

    // return the current count
    public int value() {
        return count;
    }

    // return a string representation of this counter
    public String toString() {
        return name + ": " + count;
    }

    /* compare two Counter objects based on their count
    public int compareTo(Counter that) {
        if (this.count < that.count) return -1;
        else if (this.count > that.count) return +1;
        else return 0;
    } */


    // test client
    public static void main(String[] args) {
        Counter c = new Counter("RN", 1);

        c.increment();
        c.increment();
        System.out.println(c.value());
    }
}

