public class Disque implements Comparable {
    private int val;

    public Disque (int v) {
	val = v;
    }

    public String toString() {
	return "Disque[" + val + "]";
    }

    public int compareTo(Object v) {
	Disque d = (Disque) v;
	if (val < d.val) return -1;
	else if (val == d.val) return 0;
	else return 1;
    }
}
