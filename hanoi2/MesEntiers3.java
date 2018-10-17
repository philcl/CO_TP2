// Modifier cette classe pour qu'elle devienne une classe acceptable comme
// type de disques empilables sur une tour de Hanoi.

public class MesEntiers3  {
    Integer val;

    public void init(int nb) {
	val = new Integer(nb);
    }

    public int compareTo(Object v) {
	MesEntiers3 m = (MesEntiers3) v;
	return val.compareTo(m.val);
    }

    public String toString() {
	return "MesEntiers[" + val.intValue() +"]";
    }
}

