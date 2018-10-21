// Modifier cette classe pour qu'elle devienne une classe acceptable comme
// type de disques empilables sur une tour de Hanoi.

public class MesEntiers2 implements Empilable {
    Integer val;

    public MesEntiers2(){}

    public MesEntiers2(int v) {
	val = v;
    }

    public void init(int nb) {
	val = new Integer(nb);
    }

    public int compareTo(Object v) {
	MesEntiers2 m = (MesEntiers2) v;
	return val.compareTo(m.val);
    }

    public String toString() {
	return "MesEntiers[" + val.intValue() +"]";
    }
}

