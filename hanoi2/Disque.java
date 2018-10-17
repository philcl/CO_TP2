public class Disque implements Empilable {
    private int taille;
	
    public Disque () {
    	
    }

    public Disque (int v) {
	init(v);
    }

    public String toString() {
	return "Disque[" + taille + "]";
    }

    public int compareTo(Object v) {
	Disque d = (Disque) v;
	if (taille < d.taille) return -1;
	else if (taille == d.taille) return 0;
	else return 1;
    }
    
    public void init(int taille)
    {
    	this.taille = taille;
    }
}
