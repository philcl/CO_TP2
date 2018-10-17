public class Pile {
    final int capacite;
    Object corps[];
    int ptr = 0;

    public Pile(int capa) {
	capacite = capa;
	corps = new Object[capacite];
    }

    public void empiler(Object v) throws ErreurPile {
	if (ptr == capacite) throw new ErreurPile("PilePleine");
	else corps[ptr++] = v;
    }

    public void depiler () throws ErreurPile {
	if (ptr == 0) throw new ErreurPile("PileVide");
	else ptr--;
    }

    public Object sommet() throws ErreurPile {
	if (ptr == 0) throw new ErreurPile("PileVide");
	else return corps[ptr-1];
    }

    public boolean estVide() {
	return (ptr == 0);
    }

    public int hauteur () {
	return ptr;
    }

    public int capacite () {
	return capacite;
    }

    public void affiche () { 
	for(int cur = ptr-1; cur >= 0; cur--) {
	    System.out.println(corps[cur].toString());
	}
    }
}
