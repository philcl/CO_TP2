
// Sous-classe qui permet de donner un nom aux tours et qui affiche un message
// a chaque empilement/depilement qui intervient sur la tour.
public class TourNommee extends Tour {

    protected String nom;

    public TourNommee(int nb, String n) {
	super(nb); nom = n;
    }

    public void empiler(Object d) throws ErreurPile {
	System.out.println("On empile " + d.toString() + " sur " + nom);
	super.empiler(d);
    }

    public void depiler() throws ErreurPile {
	System.out.println("On depile " + nom);
	super.depiler();
    }

    public void affiche() {
	System.out.println(nom + ":"); super.affiche();
    }
}
