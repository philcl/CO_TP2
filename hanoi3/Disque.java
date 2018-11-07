
public class Disque implements Empilable<Disque> {
    protected int val;

    public Disque() {
    }

    public void init(int v) {
	val = v;
    }

    public String toString() {
	return "Disque[" + val + "]";
    }

    @Override
    public int compareTo(Disque o) {
        return 0;//todo
    }
}
