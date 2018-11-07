import java.util.ArrayList;

// Pile Homogene de <T>, de capacite fixee a l'instantiation

public class Pile<T> { 
    final int capacite;

    // pas le droit a un tableau de generiques donc on utilise une ArrayList
    ArrayList<T> corps;  

    // index du sommet de pile : reference la derniere case occupee.
    int ptr = -1;

    // suppose 'capa' strictement positif !
    public Pile(int capa) {
	capacite = capa;
	corps = new ArrayList<T>();
    }

    public void empiler(T v) throws ErreurPile {
	if (ptr == capacite-1) throw new ErreurPile("PilePleine");
	else corps.add(++ptr, v);
    }

    public void depiler () throws ErreurPile {
	if (ptr == -1) throw new ErreurPile("PileVide");
	else corps.remove(ptr--);
    }

    public T sommet() throws ErreurPile {
	if (ptr == -1) throw new ErreurPile("PileVide");
	else return corps.get(ptr);
    }

    public boolean estVide() {
	return (ptr == -1);
    }

    public int hauteur () {
	return ptr+1;
    }

    public int capacite () {
	return capacite;
    }

    public void affiche () { 
        /* on imprime le sommet de pile au dessus ! */
	for(int i = ptr; i > -1; i--)
	    System.out.println(corps.get(i).toString());
    }
}
